SRCREV ?= "fef8d99fbce1a5e7ddfd22b0f33940b8d6193ec8"

XEN_REL = "4.13"
XEN_BRANCH = "staging"
FLASK_POLICY_FILE = "xenpolicy-${XEN_REL}-unstable"

PV = "${XEN_REL}+git${SRCPV}"

S = "${WORKDIR}/git"

SRC_URI = " \
    git://xenbits.xen.org/xen.git;branch=${XEN_BRANCH} \
    file://0001-python-pygrub-pass-DISTUTILS-xen.4.12.patch \
    "

DEFAULT_PREFERENCE = "-1"
