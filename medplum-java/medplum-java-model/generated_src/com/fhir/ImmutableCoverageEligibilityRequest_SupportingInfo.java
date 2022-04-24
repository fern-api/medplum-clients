//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link CoverageEligibilityRequest_SupportingInfo}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCoverageEligibilityRequest_SupportingInfo.builder()}.
 */
@org.immutables.value.Generated(from = "CoverageEligibilityRequest_SupportingInfo", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCoverageEligibilityRequest_SupportingInfo
    implements com.fhir.CoverageEligibilityRequest_SupportingInfo {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.lang.Boolean appliesToAll;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.positiveInt sequence;
  private final com.fhir.Reference information;

  private ImmutableCoverageEligibilityRequest_SupportingInfo(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.lang.Boolean appliesToAll,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.positiveInt sequence,
      com.fhir.Reference information) {
    this.extension = extension;
    this.id = id;
    this.appliesToAll = appliesToAll;
    this.modifierExtension = modifierExtension;
    this.sequence = sequence;
    this.information = information;
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code appliesToAll} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("appliesToAll")
  @Override
  public java.util.Optional<java.lang.Boolean> appliesToAll() {
    return java.util.Optional.ofNullable(appliesToAll);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code sequence} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("sequence")
  @Override
  public java.util.Optional<com.fhir.positiveInt> sequence() {
    return java.util.Optional.ofNullable(sequence);
  }

  /**
   * @return The value of the {@code information} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("information")
  @Override
  public com.fhir.Reference information() {
    return information;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest_SupportingInfo#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest_SupportingInfo withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCoverageEligibilityRequest_SupportingInfo(newValue, this.id, this.appliesToAll, this.modifierExtension, this.sequence, this.information);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest_SupportingInfo#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest_SupportingInfo withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCoverageEligibilityRequest_SupportingInfo(value, this.id, this.appliesToAll, this.modifierExtension, this.sequence, this.information);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest_SupportingInfo#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest_SupportingInfo withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableCoverageEligibilityRequest_SupportingInfo(
        this.extension,
        newValue,
        this.appliesToAll,
        this.modifierExtension,
        this.sequence,
        this.information);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest_SupportingInfo#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest_SupportingInfo withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableCoverageEligibilityRequest_SupportingInfo(
        this.extension,
        value,
        this.appliesToAll,
        this.modifierExtension,
        this.sequence,
        this.information);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest_SupportingInfo#appliesToAll() appliesToAll} attribute.
   * @param value The value for appliesToAll
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest_SupportingInfo withAppliesToAll(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.appliesToAll, newValue)) return this;
    return new ImmutableCoverageEligibilityRequest_SupportingInfo(this.extension, this.id, newValue, this.modifierExtension, this.sequence, this.information);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest_SupportingInfo#appliesToAll() appliesToAll} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for appliesToAll
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest_SupportingInfo withAppliesToAll(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.appliesToAll, value)) return this;
    return new ImmutableCoverageEligibilityRequest_SupportingInfo(this.extension, this.id, value, this.modifierExtension, this.sequence, this.information);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest_SupportingInfo#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest_SupportingInfo withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCoverageEligibilityRequest_SupportingInfo(this.extension, this.id, this.appliesToAll, newValue, this.sequence, this.information);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest_SupportingInfo#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest_SupportingInfo withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCoverageEligibilityRequest_SupportingInfo(this.extension, this.id, this.appliesToAll, value, this.sequence, this.information);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest_SupportingInfo#sequence() sequence} attribute.
   * @param value The value for sequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest_SupportingInfo withSequence(com.fhir.positiveInt value) {
    @javax.annotation.Nullable com.fhir.positiveInt newValue = java.util.Objects.requireNonNull(value, "sequence");
    if (this.sequence == newValue) return this;
    return new ImmutableCoverageEligibilityRequest_SupportingInfo(this.extension, this.id, this.appliesToAll, this.modifierExtension, newValue, this.information);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest_SupportingInfo#sequence() sequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest_SupportingInfo withSequence(java.util.Optional<? extends com.fhir.positiveInt> optional) {
    @javax.annotation.Nullable com.fhir.positiveInt value = optional.orElse(null);
    if (this.sequence == value) return this;
    return new ImmutableCoverageEligibilityRequest_SupportingInfo(this.extension, this.id, this.appliesToAll, this.modifierExtension, value, this.information);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CoverageEligibilityRequest_SupportingInfo#information() information} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for information
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest_SupportingInfo withInformation(com.fhir.Reference value) {
    if (this.information == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "information");
    return new ImmutableCoverageEligibilityRequest_SupportingInfo(this.extension, this.id, this.appliesToAll, this.modifierExtension, this.sequence, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCoverageEligibilityRequest_SupportingInfo} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCoverageEligibilityRequest_SupportingInfo
        && equalTo((ImmutableCoverageEligibilityRequest_SupportingInfo) another);
  }

  private boolean equalTo(ImmutableCoverageEligibilityRequest_SupportingInfo another) {
    return java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(appliesToAll, another.appliesToAll)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(sequence, another.sequence)
        && information.equals(another.information);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code id}, {@code appliesToAll}, {@code modifierExtension}, {@code sequence}, {@code information}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(appliesToAll);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(sequence);
    h += (h << 5) + information.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code CoverageEligibilityRequest_SupportingInfo} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("CoverageEligibilityRequest_SupportingInfo{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (appliesToAll != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("appliesToAll=").append(appliesToAll);
    }
    if (modifierExtension != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (sequence != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("sequence=").append(sequence);
    }
    if (builder.length() > 42) builder.append(", ");
    builder.append("information=").append(information);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "CoverageEligibilityRequest_SupportingInfo", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.CoverageEligibilityRequest_SupportingInfo {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> appliesToAll = java.util.Optional.empty();
    boolean appliesToAllIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.positiveInt> sequence = java.util.Optional.empty();
    boolean sequenceIsSet;
    @javax.annotation.Nullable com.fhir.Reference information;
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("appliesToAll")
    public void setAppliesToAll(java.util.Optional<java.lang.Boolean> appliesToAll) {
      this.appliesToAll = appliesToAll;
      this.appliesToAllIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("sequence")
    public void setSequence(java.util.Optional<com.fhir.positiveInt> sequence) {
      this.sequence = sequence;
      this.sequenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("information")
    public void setInformation(com.fhir.Reference information) {
      this.information = information;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> appliesToAll() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.positiveInt> sequence() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference information() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableCoverageEligibilityRequest_SupportingInfo fromJson(Json json) {
    ImmutableCoverageEligibilityRequest_SupportingInfo.Builder builder = ((ImmutableCoverageEligibilityRequest_SupportingInfo.Builder) ImmutableCoverageEligibilityRequest_SupportingInfo.builder());
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.appliesToAllIsSet) {
      builder.appliesToAll(json.appliesToAll);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.sequenceIsSet) {
      builder.sequence(json.sequence);
    }
    if (json.information != null) {
      builder.information(json.information);
    }
    return (ImmutableCoverageEligibilityRequest_SupportingInfo) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CoverageEligibilityRequest_SupportingInfo} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CoverageEligibilityRequest_SupportingInfo instance
   */
  public static CoverageEligibilityRequest_SupportingInfo copyOf(CoverageEligibilityRequest_SupportingInfo instance) {
    if (instance instanceof ImmutableCoverageEligibilityRequest_SupportingInfo) {
      return (ImmutableCoverageEligibilityRequest_SupportingInfo) instance;
    }
    return ((ImmutableCoverageEligibilityRequest_SupportingInfo.Builder) ImmutableCoverageEligibilityRequest_SupportingInfo.builder())
        .extension(instance.extension())
        .id(instance.id())
        .appliesToAll(instance.appliesToAll())
        .modifierExtension(instance.modifierExtension())
        .sequence(instance.sequence())
        .information(instance.information())
        .build();
  }

  /**
   * Creates a builder for {@link CoverageEligibilityRequest_SupportingInfo CoverageEligibilityRequest_SupportingInfo}.
   * <pre>
   * ImmutableCoverageEligibilityRequest_SupportingInfo.builder()
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CoverageEligibilityRequest_SupportingInfo#extension() extension}
   *    .id(String) // optional {@link CoverageEligibilityRequest_SupportingInfo#id() id}
   *    .appliesToAll(Boolean) // optional {@link CoverageEligibilityRequest_SupportingInfo#appliesToAll() appliesToAll}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CoverageEligibilityRequest_SupportingInfo#modifierExtension() modifierExtension}
   *    .sequence(com.fhir.positiveInt) // optional {@link CoverageEligibilityRequest_SupportingInfo#sequence() sequence}
   *    .information(com.fhir.Reference) // required {@link CoverageEligibilityRequest_SupportingInfo#information() information}
   *    .build();
   * </pre>
   * @return A new CoverageEligibilityRequest_SupportingInfo builder
   */
  public static InformationBuildStage builder() {
    return new ImmutableCoverageEligibilityRequest_SupportingInfo.Builder();
  }

  /**
   * Builds instances of type {@link CoverageEligibilityRequest_SupportingInfo CoverageEligibilityRequest_SupportingInfo}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "CoverageEligibilityRequest_SupportingInfo", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements InformationBuildStage, BuildFinal {
    private static final long INIT_BIT_INFORMATION = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_APPLIES_TO_ALL = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_SEQUENCE = 0x10L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.lang.Boolean appliesToAll;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.positiveInt sequence;
    private @javax.annotation.Nullable com.fhir.Reference information;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(java.util.List<com.fhir.Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = java.util.Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public final Builder extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(java.lang.String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<java.lang.String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#appliesToAll() appliesToAll} to appliesToAll.
     * @param appliesToAll The value for appliesToAll
     * @return {@code this} builder for chained invocation
     */
    public final Builder appliesToAll(boolean appliesToAll) {
      checkNotIsSet(appliesToAllIsSet(), "appliesToAll");
      this.appliesToAll = appliesToAll;
      optBits |= OPT_BIT_APPLIES_TO_ALL;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#appliesToAll() appliesToAll} to appliesToAll.
     * @param appliesToAll The value for appliesToAll
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("appliesToAll")
    public final Builder appliesToAll(java.util.Optional<java.lang.Boolean> appliesToAll) {
      checkNotIsSet(appliesToAllIsSet(), "appliesToAll");
      this.appliesToAll = appliesToAll.orElse(null);
      optBits |= OPT_BIT_APPLIES_TO_ALL;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(java.util.List<com.fhir.Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = java.util.Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public final Builder modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder sequence(com.fhir.positiveInt sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = java.util.Objects.requireNonNull(sequence, "sequence");
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sequence")
    public final Builder sequence(java.util.Optional<? extends com.fhir.positiveInt> sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = sequence.orElse(null);
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the value for the {@link CoverageEligibilityRequest_SupportingInfo#information() information} attribute.
     * @param information The value for information 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("information")
    public final Builder information(com.fhir.Reference information) {
      checkNotIsSet(informationIsSet(), "information");
      this.information = java.util.Objects.requireNonNull(information, "information");
      initBits &= ~INIT_BIT_INFORMATION;
      return this;
    }

    /**
     * Builds a new {@link CoverageEligibilityRequest_SupportingInfo CoverageEligibilityRequest_SupportingInfo}.
     * @return An immutable instance of CoverageEligibilityRequest_SupportingInfo
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.CoverageEligibilityRequest_SupportingInfo build() {
      checkRequiredAttributes();
      return new ImmutableCoverageEligibilityRequest_SupportingInfo(extension, id, appliesToAll, modifierExtension, sequence, information);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean appliesToAllIsSet() {
      return (optBits & OPT_BIT_APPLIES_TO_ALL) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean sequenceIsSet() {
      return (optBits & OPT_BIT_SEQUENCE) != 0;
    }

    private boolean informationIsSet() {
      return (initBits & INIT_BIT_INFORMATION) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of CoverageEligibilityRequest_SupportingInfo is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!informationIsSet()) attributes.add("information");
      return "Cannot build CoverageEligibilityRequest_SupportingInfo, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "CoverageEligibilityRequest_SupportingInfo", generator = "Immutables")
  public interface InformationBuildStage {
    /**
     * Initializes the value for the {@link CoverageEligibilityRequest_SupportingInfo#information() information} attribute.
     * @param information The value for information 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal information(com.fhir.Reference information);
  }

  @org.immutables.value.Generated(from = "CoverageEligibilityRequest_SupportingInfo", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(java.lang.String id);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<java.lang.String> id);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#appliesToAll() appliesToAll} to appliesToAll.
     * @param appliesToAll The value for appliesToAll
     * @return {@code this} builder for chained invocation
     */
    BuildFinal appliesToAll(boolean appliesToAll);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#appliesToAll() appliesToAll} to appliesToAll.
     * @param appliesToAll The value for appliesToAll
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal appliesToAll(java.util.Optional<java.lang.Boolean> appliesToAll);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sequence(com.fhir.positiveInt sequence);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sequence(java.util.Optional<? extends com.fhir.positiveInt> sequence);

    /**
     * Builds a new {@link CoverageEligibilityRequest_SupportingInfo CoverageEligibilityRequest_SupportingInfo}.
     * @return An immutable instance of CoverageEligibilityRequest_SupportingInfo
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    CoverageEligibilityRequest_SupportingInfo build();
  }
}
