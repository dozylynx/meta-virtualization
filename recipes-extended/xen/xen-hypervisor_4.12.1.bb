FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
require xen.inc
require xen-4.12.inc

# Multiple recipes are used to build Xen and its components:
# this allows for varying the target architecture of the different components
#  eg. 32-bit tools and a 64-bit hypervisor
#
# This recipe shares a common xen.inc with other recipes.
# PN in this recipe is "xen-hypervisor", rather than "xen" as xen.inc is
# written to expect, so in order to produce the expected package names
# with a "xen-" rather than "xen-hypervisor-" prefix, this python section
# renames the FILES_... variables defined in xen.inc. and sets PACKAGES.

python () {
    packages = []
    for raw_package in d.getVar("PACKAGES_hypervisor").split():
        package = raw_package.replace("xen-hypervisor-", "xen-")
        d.renameVar("FILES_xen-hypervisor-" + package[4:],
                    "FILES_" + package)
        packages.append(package)
    d.setVar("PACKAGES", ' '.join(packages))
}

do_compile() {
    do_compile_hypervisor
}

do_install() {
    do_install_hypervisor
}
