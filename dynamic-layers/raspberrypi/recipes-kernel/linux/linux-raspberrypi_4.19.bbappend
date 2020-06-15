FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

# If the Xen DISTRO_FEATURE is enabled, add these Xen-specific patches
# to the Raspberry Pi 4-64 Linux kernel

RPI4_XEN_SRC_URI_EXTRA = " \
    file://0002-Disable-DMA-in-sdhci-driver.patch \
    file://0003-Fix-PCIe-in-dom0-for-RPi4.patch \
    "

SRC_URI_append_raspberrypi4-64 += " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'xen', '${RPI4_XEN_SRC_URI_EXTRA}', '', d)} \
    "
