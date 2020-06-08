const InsumosController = require("../controllers/insumos.controller");
const route = require("../config/middleware");

module.exports = function (router) {
  router.post("/insumos", route.protected, InsumosController.create);
  router.get("/insumos", route.protected, InsumosController.getAll);
  router.get("/insumos/:id", route.protected, InsumosController.get);
  router.put("/insumos/:id", route.protected, InsumosController.update);
  router.delete("/insumos/:id", route.protected, InsumosController.delete);
};
