require cog.inc

SRC_URI:append = " file://0001-Fix-missing-xkbcommon.h-include.patch"
SRC_URI[sha256sum] = "9983c621c8e14fca3792ff566cb6b86d6a1f17446eb4c083af4a5a749112982f"

RDEPENDS:${PN} += "wpewebkit (>= 2.34)"
