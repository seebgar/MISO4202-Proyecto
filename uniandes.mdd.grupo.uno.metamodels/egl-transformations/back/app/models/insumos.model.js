const mongoose = require("mongoose");

const InsumosSchema = mongoose.Schema({
sku: { type: String, required:  true },
stockMinimo: { type: Number, required:  true },
stockMedio: { type: Number, required:  true },
stockMaximo: { type: Number, required:  true },
unidad: { type: String, required:  true },
inventarioActual: { type: Number, required:  true },
reOrden: { type: Number, required:  true },
createdAt: { type: Date, required:  false },

});

InsumosSchema.statics = {
  get: function (query, callback) {
    this.findOne(query).exec(callback);
  },
  getAll: function (query, callback) {
    this.find(query).exec(callback);
  },
  updateById: function (id, updateData, callback) {
    this.findOneAndUpdate(
      { _id: id },
      { $set: updateData },
      { new: true },
      callback
    );
  },
  removeById: function (removeData, callback) {
    this.findOneAndRemove(removeData, callback);
  },
  create: function (data, callback) {
    const insumos = new this(data);
    insumos.save(callback);
  },
};

const Insumos = (module.exports = mongoose.model("Insumos", InsumosSchema));
