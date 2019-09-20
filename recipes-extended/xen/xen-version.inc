SRCREV ?= "278e46ae8f99485915ae662e7905c8333a55048a"

XEN_REL ?= "4.12"
XEN_BRANCH ?= "stable-4.12"

SRC_URI = " \
    git://xenbits.xen.org/xen.git;branch=${XEN_BRANCH} \
    file://0001-python-pygrub-pass-DISTUTILS-xen.4.12.patch \
    "

PV = "${XEN_REL}+git${SRCPV}"

S = "${WORKDIR}/git"
