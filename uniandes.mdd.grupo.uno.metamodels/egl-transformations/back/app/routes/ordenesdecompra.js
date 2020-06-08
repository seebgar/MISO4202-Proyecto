const OrdenesDeCompraController = require("../controllers/ordenesdecompra.controller");
const route = require("../config/middleware");

module.exports = function (router) {
  router.post("/ordenesdecompra", route.protected, OrdenesDeCompraController.create);
  router.get("/ordenesdecompra", route.protected, OrdenesDeCompraController.getAll);
  router.get("/ordenesdecompra/:id", route.protected, OrdenesDeCompraController.get);
  router.put("/ordenesdecompra/:id", route.protected, OrdenesDeCompraController.update);
  router.delete("/ordenesdecompra/:id", route.protected, OrdenesDeCompraController.delete);
};
