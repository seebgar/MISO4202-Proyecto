const mongoose = require("mongoose");

const CfsmSchema = mongoose.Schema({

});

CfsmSchema.statics = {
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
    const cfsm = new this(data);
    cfsm.save(callback);
  },
};

const Cfsm = (module.exports = mongoose.model("Cfsm", CfsmSchema));
