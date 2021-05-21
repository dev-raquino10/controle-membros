

!function (l) { "use strict"; l("#sidebarToggle").on("click", function (o) { o.preventDefault(), l("body").toggleClass("sidebar-toggled"), l(".sidebar").toggleClass("toggled") }), l("body.fixed-nav .sidebar").on("mousewheel DOMMouseScroll wheel", function (o) { if (768 < l(window).width()) { var e = o.originalEvent, t = e.wheelDelta || -e.detail; this.scrollTop += 30 * (t < 0 ? 1 : -1), o.preventDefault() } }), l(document).on("scroll", function () { 100 < l(this).scrollTop() ? l(".scroll-to-top").fadeIn() : l(".scroll-to-top").fadeOut() }), l(document).on("click", "a.scroll-to-top", function (o) { var e = l(this); l("html, body").stop().animate({ scrollTop: l(e.attr("href")).offset().top }, 1e3, "easeInOutExpo"), o.preventDefault() }) }(jQuery);

var selection = document.getElementById("selectTipoItem");
var selected = selection.options[selection.selectedIndex].text;
function valor() {
    if (selected == "categoria") {
        document.getElementById("tabelaCategoria").innerHTML = 10;
    }
    if (selected == "parceiro") {
        document.getElementById("tabelaParceiro").innerHTML = 20;
    }
    if (selected == "oferta") {
        document.getElementById("tabelaOferta").innerHTML = 20;
    }
}
valor();
selection.addEventListener("keyup", valor);
selected.addEventListener("keyup", valor);// JavaScript source code
