FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
require xen.inc
require xen-4.12.inc

PACKAGES = "${PACKAGES_tools}"

do_compile() {
    do_compile_tools
}

do_install() {
    do_install_tools
}
