const mongoose = require("mongoose");

const ProveedoresSchema = mongoose.Schema({
razonSocial: { type: String, required:  true },
nit: { type: String, required:  true },
direccion: { type: Number, required:  true },
telefono: { type: Number, required:  true },
ordenesEnProceso: { type: Number, required:  true },
ordenesCompletadas: { type: String, required:  true },

});

ProveedoresSchema.statics = {
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
    const proveedores = new this(data);
    proveedores.save(callback);
  },
};

const Proveedores = (module.exports = mongoose.model("Proveedores", ProveedoresSchema));
