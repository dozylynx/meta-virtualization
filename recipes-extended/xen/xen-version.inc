SRCREV ?= "a5fcafbfbee55261853fba07149c1c795f2baf58"

XEN_REL ?= "4.12"
XEN_BRANCH ?= "stable-4.12"

SRC_URI = " \
    git://xenbits.xen.org/xen.git;branch=${XEN_BRANCH} \
    file://0001-python-pygrub-pass-DISTUTILS-xen.4.12.patch \
    "

LIC_FILES_CHKSUM = "file://COPYING;md5=bbb4b1bdc2c3b6743da3c39d03249095"

PV = "${XEN_REL}+git${SRCPV}"

S = "${WORKDIR}/git"
