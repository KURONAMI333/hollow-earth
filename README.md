# Hollow Earth

> Two overworlds stacked in one dimension. Y 0-60: an inverted cave-ceiling world. Y 80-200: the normal surface world. Y 60-80: a void gap between them.

> **This is a worldgen MOD, not the *Hollow Earth* modpack.**

[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)
[![NeoForge 1.21.1](https://img.shields.io/badge/NeoForge-1.21.1-orange.svg)](https://neoforged.net)
[![Depends on Isekai API](https://img.shields.io/badge/Depends-Isekai%20API-9333ea)](https://github.com/KURONAMI333/isekai-api)

---

## Concept

Climb up — the normal surface world. Dig down — at some point you punch through the void and emerge into the inverted world, hanging from the cave ceiling. Two completely different ecosystems share one dimension, connected by the void gap.

Inspired by hollow-earth theory (Verne's *Journey to the Center of the Earth*, Burroughs' Pellucidar, *Subnautica: Below Zero*).

## How it works

Hollow Earth is built on **[Isekai API](https://github.com/KURONAMI333/isekai-api)**, a neutral universal worldgen library.

This consumer is the first one to drive the library's **multi-layer worldshape** machinery (`declareLayeredWorldshape` with `TransitionRule.Gap`). The library has no concept of "hollow earth" — Hollow Earth just composes `mask_y_range`, `SurfaceAnchor.WorldSurface` for the outer layer, and a custom `SurfaceAnchor` for the inverted ceiling layer.

## Status

**v0.1**: skeleton. `LayeredDescriptor` declaration + density composition land with Isekai API v0.2.

## Dependencies

- NeoForge 1.21.1
- [Isekai API](https://github.com/KURONAMI333/isekai-api) (required)

## License

[MIT License](LICENSE) — modpack inclusion welcome, no credit required.

## Credits

- Author: KURONAMI
