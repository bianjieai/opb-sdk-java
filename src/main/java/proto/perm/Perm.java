// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: perm/perm.proto

package proto.perm;

public final class Perm {
  private Perm() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * Role represents a role
   * </pre>
   *
   * Protobuf enum {@code iritamod.perm.Role}
   */
  public enum Role
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * ROOT_ADMIN defines the root admin role index.
     * </pre>
     *
     * <code>ROOT_ADMIN = 0 [(.gogoproto.enumvalue_customname) = "RoleRootAdmin"];</code>
     */
    ROOT_ADMIN(0),
    /**
     * <pre>
     * PERM_ADMIN defines the permission admin role index.
     * </pre>
     *
     * <code>PERM_ADMIN = 1 [(.gogoproto.enumvalue_customname) = "RolePermAdmin"];</code>
     */
    PERM_ADMIN(1),
    /**
     * <pre>
     * BLACKLIST_ADMIN defines the blacklist admin role index.
     * </pre>
     *
     * <code>BLACKLIST_ADMIN = 2 [(.gogoproto.enumvalue_customname) = "RoleBlacklistAdmin"];</code>
     */
    BLACKLIST_ADMIN(2),
    /**
     * <pre>
     * NODE_ADMIN defines the node admin role index.
     * </pre>
     *
     * <code>NODE_ADMIN = 3 [(.gogoproto.enumvalue_customname) = "RoleNodeAdmin"];</code>
     */
    NODE_ADMIN(3),
    /**
     * <pre>
     * PARAM_ADMIN defines the param admin role index.
     * </pre>
     *
     * <code>PARAM_ADMIN = 4 [(.gogoproto.enumvalue_customname) = "RoleParamAdmin"];</code>
     */
    PARAM_ADMIN(4),
    /**
     * <pre>
     * POWER_USER defines the power user role index.
     * </pre>
     *
     * <code>POWER_USER = 5 [(.gogoproto.enumvalue_customname) = "RolePowerUser"];</code>
     */
    POWER_USER(5),
    /**
     * <pre>
     * RELAYER_USER defines the relayer user role index.
     * </pre>
     *
     * <code>RELAYER_USER = 6 [(.gogoproto.enumvalue_customname) = "RoleRelayerUser"];</code>
     */
    RELAYER_USER(6),
    /**
     * <pre>
     * ID_ADMIN defines the identity admin role index.
     * </pre>
     *
     * <code>ID_ADMIN = 7 [(.gogoproto.enumvalue_customname) = "RoleIDAdmin"];</code>
     */
    ID_ADMIN(7),
    /**
     * <pre>
     * BASE_M1_ADMIN defines the base M1 admin role index.
     * </pre>
     *
     * <code>BASE_M1_ADMIN = 8 [(.gogoproto.enumvalue_customname) = "RoleBaseM1Admin"];</code>
     */
    BASE_M1_ADMIN(8),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * ROOT_ADMIN defines the root admin role index.
     * </pre>
     *
     * <code>ROOT_ADMIN = 0 [(.gogoproto.enumvalue_customname) = "RoleRootAdmin"];</code>
     */
    public static final int ROOT_ADMIN_VALUE = 0;
    /**
     * <pre>
     * PERM_ADMIN defines the permission admin role index.
     * </pre>
     *
     * <code>PERM_ADMIN = 1 [(.gogoproto.enumvalue_customname) = "RolePermAdmin"];</code>
     */
    public static final int PERM_ADMIN_VALUE = 1;
    /**
     * <pre>
     * BLACKLIST_ADMIN defines the blacklist admin role index.
     * </pre>
     *
     * <code>BLACKLIST_ADMIN = 2 [(.gogoproto.enumvalue_customname) = "RoleBlacklistAdmin"];</code>
     */
    public static final int BLACKLIST_ADMIN_VALUE = 2;
    /**
     * <pre>
     * NODE_ADMIN defines the node admin role index.
     * </pre>
     *
     * <code>NODE_ADMIN = 3 [(.gogoproto.enumvalue_customname) = "RoleNodeAdmin"];</code>
     */
    public static final int NODE_ADMIN_VALUE = 3;
    /**
     * <pre>
     * PARAM_ADMIN defines the param admin role index.
     * </pre>
     *
     * <code>PARAM_ADMIN = 4 [(.gogoproto.enumvalue_customname) = "RoleParamAdmin"];</code>
     */
    public static final int PARAM_ADMIN_VALUE = 4;
    /**
     * <pre>
     * POWER_USER defines the power user role index.
     * </pre>
     *
     * <code>POWER_USER = 5 [(.gogoproto.enumvalue_customname) = "RolePowerUser"];</code>
     */
    public static final int POWER_USER_VALUE = 5;
    /**
     * <pre>
     * RELAYER_USER defines the relayer user role index.
     * </pre>
     *
     * <code>RELAYER_USER = 6 [(.gogoproto.enumvalue_customname) = "RoleRelayerUser"];</code>
     */
    public static final int RELAYER_USER_VALUE = 6;
    /**
     * <pre>
     * ID_ADMIN defines the identity admin role index.
     * </pre>
     *
     * <code>ID_ADMIN = 7 [(.gogoproto.enumvalue_customname) = "RoleIDAdmin"];</code>
     */
    public static final int ID_ADMIN_VALUE = 7;
    /**
     * <pre>
     * BASE_M1_ADMIN defines the base M1 admin role index.
     * </pre>
     *
     * <code>BASE_M1_ADMIN = 8 [(.gogoproto.enumvalue_customname) = "RoleBaseM1Admin"];</code>
     */
    public static final int BASE_M1_ADMIN_VALUE = 8;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @Deprecated
    public static Role valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Role forNumber(int value) {
      switch (value) {
        case 0: return ROOT_ADMIN;
        case 1: return PERM_ADMIN;
        case 2: return BLACKLIST_ADMIN;
        case 3: return NODE_ADMIN;
        case 4: return PARAM_ADMIN;
        case 5: return POWER_USER;
        case 6: return RELAYER_USER;
        case 7: return ID_ADMIN;
        case 8: return BASE_M1_ADMIN;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Role>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Role> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Role>() {
            public Role findValueByNumber(int number) {
              return Role.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return Perm.getDescriptor().getEnumTypes().get(0);
    }

    private static final Role[] VALUES = values();

    public static Role valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Role(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:iritamod.perm.Role)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\017perm/perm.proto\022\riritamod.perm\032\024gogopr" +
      "oto/gogo.proto*\340\002\n\004Role\022!\n\nROOT_ADMIN\020\000\032" +
      "\021\212\235 \rRoleRootAdmin\022!\n\nPERM_ADMIN\020\001\032\021\212\235 \r" +
      "RolePermAdmin\022+\n\017BLACKLIST_ADMIN\020\002\032\026\212\235 \022" +
      "RoleBlacklistAdmin\022!\n\nNODE_ADMIN\020\003\032\021\212\235 \r" +
      "RoleNodeAdmin\022#\n\013PARAM_ADMIN\020\004\032\022\212\235 \016Role" +
      "ParamAdmin\022!\n\nPOWER_USER\020\005\032\021\212\235 \rRolePowe" +
      "rUser\022%\n\014RELAYER_USER\020\006\032\023\212\235 \017RoleRelayer" +
      "User\022\035\n\010ID_ADMIN\020\007\032\017\212\235 \013RoleIDAdmin\022&\n\rB" +
      "ASE_M1_ADMIN\020\010\032\023\212\235 \017RoleBaseM1Admin\032\014\260\244\036" +
      "\001\250\244\036\000\210\243\036\000B\024\n\nproto.perm\310\341\036\000\300\343\036\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.GoGoProtos.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.enumStringer);
    registry.add(com.google.protobuf.GoGoProtos.enumvalueCustomname);
    registry.add(com.google.protobuf.GoGoProtos.goprotoEnumPrefix);
    registry.add(com.google.protobuf.GoGoProtos.goprotoEnumStringer);
    registry.add(com.google.protobuf.GoGoProtos.goprotoGettersAll);
    registry.add(com.google.protobuf.GoGoProtos.goprotoRegistration);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
