const mongoose = require("mongoose");

const OrdenesDeCompraSchema = mongoose.Schema({
recibido: { type: String, required:  true },
insumos: { type: String, required:  true },
descripcion: { type: Number, required:  true },
ajustada: { type: String, required:  true },
anulada: { type: String, required:  true },
fechaLlegada: { type: Number, required:  true },
valorTotal: { type: Number, required:  true },

});

OrdenesDeCompraSchema.statics = {
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
    const ordenesdecompra = new this(data);
    ordenesdecompra.save(callback);
  },
};

const OrdenesDeCompra = (module.exports = mongoose.model("OrdenesDeCompra", OrdenesDeCompraSchema));
