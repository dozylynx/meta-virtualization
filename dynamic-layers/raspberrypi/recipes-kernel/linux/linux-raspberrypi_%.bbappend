# For a Xen-enabled distro, override the contents of cmdline.txt

DEFAULT_CMDLINE := "${CMDLINE}"
XEN_CMDLINE ?= "console=hvc0 clk_ignore_unused root=/dev/mmcblk0p2 rootwait"
CMDLINE = "${@bb.utils.contains('DISTRO_FEATURES', 'xen', '${XEN_CMDLINE}', '${DEFAULT_CMDLINE}', d)}"
