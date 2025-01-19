<div align="center">
<img src="https://github.com/zh-sc/Skroot-Next/blob/main/docr/ipc_home/icr_skroot.png" style="width: 96px;" alt="logo">
<h1 align="center">Skroot-Next</h1>

[![Latest Release](https://img.shields.io/github/v/release/zh-sc/Skroot-Next?label=Release&logo=github)](https://github.com/zh-sc/Skroot-Next/releases/latest)
[![Channel](https://img.shields.io/badge/Follow-Telegram-blue.svg?logo=telegram)](https://t.me/Skroot_Next)

</div>

## 介绍
## SKRoot-Next - Super Kernel Root
- 全网无root检测手段，跟面具完全不同思路.

- 摆脱面具被检测的弱点，完美隐藏root功能
- 全程不需要暂停SELinux，实现真正的SELinux  0%触碰.
- 通用性强，通杀所有内核，不需要内核源码
- 直接patch内核，兼容安卓APP直接JNI调用，稳定、流畅、不闪退。
- Android Linux内核 Android 系统补丁。
- Skroot-Next依赖于 [Skroot](https://github.com/bmax121/KernelPatch/).
- Skroot UI 和 APModule 源代码是从 KernelSU 和Skroot 参考和修改的。
-  [KernelSU](https://github.com/tiann/KernelSU).[Skroot](https://github.com/abcz316/SKRoot-linuxKernelRoot)

## 支持版本
仅支持 ARM64 架构。

仅支持 Android 内核版本 4.6 - 6.1
## 要求

内核配置:

- `Linux4.6 ~ 6.1`完全支持

## 危险警告

- 48位SuperKey 具有比 root 访问权限更高的权限。

- 密钥保护它们不被暴露以维护设备的安全性至关重要。

## 下载
[Github](https://github.com/zh-sc/Skroot-Next) 

## Get Help | 获得帮助

### 用法
-请记住48位密钥，这是你的唯一凭证

### 更新

- Telegram Channel | 官方电报: [@Skroot-next](https://t.me/Skroot_Next)

### 讨论

- Telegram Group | 电报群: [@交流群](https://t.me/skroot_Next_chat)

### 更多内容

- [查看](docs/)

## 学习

- [KernelPatch](https://github.com/abcz316/SKRoot-linuxKernelRoot): 参考核心
- [Magisk](https://github.com/topjohnwu/Magisk): 参考自动化修订boot脚本
- [KernelSU](https://github.com/tiann/KernelSU): 参考App UI 和Linux内核之类的支持
- [APatch](https://github.com/bmax121/APatch):参考su运作方式
## 许可证

Skroot-Next根据 GNU 通用公共许可证 v3[GPL-3](http://www.gnu.org/copyleft/gpl.html).
