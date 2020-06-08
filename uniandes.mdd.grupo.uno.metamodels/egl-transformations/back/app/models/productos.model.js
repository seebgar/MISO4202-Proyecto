const mongoose = require("mongoose");

const ProductosSchema = mongoose.Schema({
nombre: { type: String, required:  true },
inventarioActual: { type: String, required:  true },
insumos: { type: Number, required:  true },

});

ProductosSchema.statics = {
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
    const productos = new this(data);
    productos.save(callback);
  },
};

const Productos = (module.exports = mongoose.model("Productos", ProductosSchema));
