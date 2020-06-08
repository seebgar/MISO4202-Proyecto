"use strict";

var OrdenesDeCompra = require("../models/ordenesdecompra.model");

exports.create = function (req, res) {
  OrdenesDeCompra.create(req.body, function (err, result) {
    if (!err) {
      return res.json(result);
    } else {
      return res.send(err);
    }
  });
};

exports.get = function (req, res) {
  OrdenesDeCompra.get({ _id: req.params.id }, function (err, result) {
    if (!err) {
      return res.json(result);
    } else {
      return res.send(err);
    }
  });
};

exports.getAll = function (req, res) {
  OrdenesDeCompra.getAll({}, function (err, result) {
    if (!err) {
      return res.json(result);
    } else {
      return res.send(err);
    }
  });
};

exports.update = function (req, res) {
  OrdenesDeCompra.updateById(req.params.id, req.body, function (err, result) {
    if (!err) {
      return res.json(result);
    } else {
      return res.send(err);
    }
  });
};

exports.delete = function (req, res) {
  OrdenesDeCompra.removeById({ _id: req.params.id }, function (err, result) {
    if (!err) {
      return res.json(result);
    } else {
      return res.send(err);
    }
  });
};
