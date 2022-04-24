//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link TerminologyCapabilities_CodeSystem}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTerminologyCapabilities_CodeSystem.builder()}.
 */
@org.immutables.value.Generated(from = "TerminologyCapabilities_CodeSystem", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTerminologyCapabilities_CodeSystem
    implements com.fhir.TerminologyCapabilities_CodeSystem {
  private final @javax.annotation.Nullable java.util.List<com.fhir.TerminologyCapabilities_Version> version;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.lang.Boolean subsumption;
  private final @javax.annotation.Nullable com.fhir.canonical uri;
  private final @javax.annotation.Nullable java.lang.String id;

  private ImmutableTerminologyCapabilities_CodeSystem(
      @javax.annotation.Nullable java.util.List<com.fhir.TerminologyCapabilities_Version> version,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.lang.Boolean subsumption,
      @javax.annotation.Nullable com.fhir.canonical uri,
      @javax.annotation.Nullable java.lang.String id) {
    this.version = version;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.subsumption = subsumption;
    this.uri = uri;
    this.id = id;
  }

  /**
   * @return The value of the {@code version} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("version")
  @Override
  public java.util.Optional<java.util.List<com.fhir.TerminologyCapabilities_Version>> version() {
    return java.util.Optional.ofNullable(version);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code subsumption} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subsumption")
  @Override
  public java.util.Optional<java.lang.Boolean> subsumption() {
    return java.util.Optional.ofNullable(subsumption);
  }

  /**
   * @return The value of the {@code uri} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("uri")
  @Override
  public java.util.Optional<com.fhir.canonical> uri() {
    return java.util.Optional.ofNullable(uri);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_CodeSystem#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_CodeSystem withVersion(java.util.List<com.fhir.TerminologyCapabilities_Version> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.TerminologyCapabilities_Version> newValue = java.util.Objects.requireNonNull(value, "version");
    if (this.version == newValue) return this;
    return new ImmutableTerminologyCapabilities_CodeSystem(newValue, this.extension, this.modifierExtension, this.subsumption, this.uri, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_CodeSystem#version() version} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities_CodeSystem withVersion(java.util.Optional<? extends java.util.List<com.fhir.TerminologyCapabilities_Version>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.TerminologyCapabilities_Version> value = optional.orElse(null);
    if (this.version == value) return this;
    return new ImmutableTerminologyCapabilities_CodeSystem(value, this.extension, this.modifierExtension, this.subsumption, this.uri, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_CodeSystem#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_CodeSystem withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTerminologyCapabilities_CodeSystem(this.version, newValue, this.modifierExtension, this.subsumption, this.uri, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_CodeSystem#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities_CodeSystem withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTerminologyCapabilities_CodeSystem(this.version, value, this.modifierExtension, this.subsumption, this.uri, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_CodeSystem#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_CodeSystem withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTerminologyCapabilities_CodeSystem(this.version, this.extension, newValue, this.subsumption, this.uri, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_CodeSystem#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities_CodeSystem withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTerminologyCapabilities_CodeSystem(this.version, this.extension, value, this.subsumption, this.uri, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_CodeSystem#subsumption() subsumption} attribute.
   * @param value The value for subsumption
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_CodeSystem withSubsumption(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.subsumption, newValue)) return this;
    return new ImmutableTerminologyCapabilities_CodeSystem(this.version, this.extension, this.modifierExtension, newValue, this.uri, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_CodeSystem#subsumption() subsumption} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subsumption
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_CodeSystem withSubsumption(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.subsumption, value)) return this;
    return new ImmutableTerminologyCapabilities_CodeSystem(this.version, this.extension, this.modifierExtension, value, this.uri, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_CodeSystem#uri() uri} attribute.
   * @param value The value for uri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_CodeSystem withUri(com.fhir.canonical value) {
    @javax.annotation.Nullable com.fhir.canonical newValue = java.util.Objects.requireNonNull(value, "uri");
    if (this.uri == newValue) return this;
    return new ImmutableTerminologyCapabilities_CodeSystem(this.version, this.extension, this.modifierExtension, this.subsumption, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_CodeSystem#uri() uri} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for uri
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities_CodeSystem withUri(java.util.Optional<? extends com.fhir.canonical> optional) {
    @javax.annotation.Nullable com.fhir.canonical value = optional.orElse(null);
    if (this.uri == value) return this;
    return new ImmutableTerminologyCapabilities_CodeSystem(this.version, this.extension, this.modifierExtension, this.subsumption, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_CodeSystem#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_CodeSystem withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableTerminologyCapabilities_CodeSystem(this.version, this.extension, this.modifierExtension, this.subsumption, this.uri, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_CodeSystem#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_CodeSystem withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableTerminologyCapabilities_CodeSystem(this.version, this.extension, this.modifierExtension, this.subsumption, this.uri, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTerminologyCapabilities_CodeSystem} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTerminologyCapabilities_CodeSystem
        && equalTo((ImmutableTerminologyCapabilities_CodeSystem) another);
  }

  private boolean equalTo(ImmutableTerminologyCapabilities_CodeSystem another) {
    return java.util.Objects.equals(version, another.version)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(subsumption, another.subsumption)
        && java.util.Objects.equals(uri, another.uri)
        && java.util.Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code version}, {@code extension}, {@code modifierExtension}, {@code subsumption}, {@code uri}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(version);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(subsumption);
    h += (h << 5) + java.util.Objects.hashCode(uri);
    h += (h << 5) + java.util.Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code TerminologyCapabilities_CodeSystem} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("TerminologyCapabilities_CodeSystem{");
    if (version != null) {
      builder.append("version=").append(version);
    }
    if (extension != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (subsumption != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("subsumption=").append(subsumption);
    }
    if (uri != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("uri=").append(uri);
    }
    if (id != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "TerminologyCapabilities_CodeSystem", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.TerminologyCapabilities_CodeSystem {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.TerminologyCapabilities_Version>> version = java.util.Optional.empty();
    boolean versionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> subsumption = java.util.Optional.empty();
    boolean subsumptionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.canonical> uri = java.util.Optional.empty();
    boolean uriIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public void setVersion(java.util.Optional<java.util.List<com.fhir.TerminologyCapabilities_Version>> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subsumption")
    public void setSubsumption(java.util.Optional<java.lang.Boolean> subsumption) {
      this.subsumption = subsumption;
      this.subsumptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    public void setUri(java.util.Optional<com.fhir.canonical> uri) {
      this.uri = uri;
      this.uriIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.TerminologyCapabilities_Version>> version() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> subsumption() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.canonical> uri() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableTerminologyCapabilities_CodeSystem fromJson(Json json) {
    ImmutableTerminologyCapabilities_CodeSystem.Builder builder = ImmutableTerminologyCapabilities_CodeSystem.builder();
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.subsumptionIsSet) {
      builder.subsumption(json.subsumption);
    }
    if (json.uriIsSet) {
      builder.uri(json.uri);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableTerminologyCapabilities_CodeSystem) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TerminologyCapabilities_CodeSystem} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TerminologyCapabilities_CodeSystem instance
   */
  public static TerminologyCapabilities_CodeSystem copyOf(TerminologyCapabilities_CodeSystem instance) {
    if (instance instanceof ImmutableTerminologyCapabilities_CodeSystem) {
      return (ImmutableTerminologyCapabilities_CodeSystem) instance;
    }
    return ImmutableTerminologyCapabilities_CodeSystem.builder()
        .version(instance.version())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .subsumption(instance.subsumption())
        .uri(instance.uri())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link TerminologyCapabilities_CodeSystem TerminologyCapabilities_CodeSystem}.
   * <pre>
   * ImmutableTerminologyCapabilities_CodeSystem.builder()
   *    .version(List&amp;lt;com.fhir.TerminologyCapabilities_Version&amp;gt;) // optional {@link TerminologyCapabilities_CodeSystem#version() version}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link TerminologyCapabilities_CodeSystem#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link TerminologyCapabilities_CodeSystem#modifierExtension() modifierExtension}
   *    .subsumption(Boolean) // optional {@link TerminologyCapabilities_CodeSystem#subsumption() subsumption}
   *    .uri(com.fhir.canonical) // optional {@link TerminologyCapabilities_CodeSystem#uri() uri}
   *    .id(String) // optional {@link TerminologyCapabilities_CodeSystem#id() id}
   *    .build();
   * </pre>
   * @return A new TerminologyCapabilities_CodeSystem builder
   */
  public static ImmutableTerminologyCapabilities_CodeSystem.Builder builder() {
    return new ImmutableTerminologyCapabilities_CodeSystem.Builder();
  }

  /**
   * Builds instances of type {@link TerminologyCapabilities_CodeSystem TerminologyCapabilities_CodeSystem}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "TerminologyCapabilities_CodeSystem", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_VERSION = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_SUBSUMPTION = 0x8L;
    private static final long OPT_BIT_URI = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.TerminologyCapabilities_Version> version;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.Boolean subsumption;
    private @javax.annotation.Nullable com.fhir.canonical uri;
    private @javax.annotation.Nullable java.lang.String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_CodeSystem#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    public final Builder version(java.util.List<com.fhir.TerminologyCapabilities_Version> version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = java.util.Objects.requireNonNull(version, "version");
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_CodeSystem#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public final Builder version(java.util.Optional<? extends java.util.List<com.fhir.TerminologyCapabilities_Version>> version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = version.orElse(null);
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_CodeSystem#extension() extension} to extension.
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
     * Initializes the optional value {@link TerminologyCapabilities_CodeSystem#extension() extension} to extension.
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
     * Initializes the optional value {@link TerminologyCapabilities_CodeSystem#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TerminologyCapabilities_CodeSystem#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TerminologyCapabilities_CodeSystem#subsumption() subsumption} to subsumption.
     * @param subsumption The value for subsumption
     * @return {@code this} builder for chained invocation
     */
    public final Builder subsumption(boolean subsumption) {
      checkNotIsSet(subsumptionIsSet(), "subsumption");
      this.subsumption = subsumption;
      optBits |= OPT_BIT_SUBSUMPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_CodeSystem#subsumption() subsumption} to subsumption.
     * @param subsumption The value for subsumption
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subsumption")
    public final Builder subsumption(java.util.Optional<java.lang.Boolean> subsumption) {
      checkNotIsSet(subsumptionIsSet(), "subsumption");
      this.subsumption = subsumption.orElse(null);
      optBits |= OPT_BIT_SUBSUMPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_CodeSystem#uri() uri} to uri.
     * @param uri The value for uri
     * @return {@code this} builder for chained invocation
     */
    public final Builder uri(com.fhir.canonical uri) {
      checkNotIsSet(uriIsSet(), "uri");
      this.uri = java.util.Objects.requireNonNull(uri, "uri");
      optBits |= OPT_BIT_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_CodeSystem#uri() uri} to uri.
     * @param uri The value for uri
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    public final Builder uri(java.util.Optional<? extends com.fhir.canonical> uri) {
      checkNotIsSet(uriIsSet(), "uri");
      this.uri = uri.orElse(null);
      optBits |= OPT_BIT_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_CodeSystem#id() id} to id.
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
     * Initializes the optional value {@link TerminologyCapabilities_CodeSystem#id() id} to id.
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
     * Builds a new {@link TerminologyCapabilities_CodeSystem TerminologyCapabilities_CodeSystem}.
     * @return An immutable instance of TerminologyCapabilities_CodeSystem
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.TerminologyCapabilities_CodeSystem build() {
      return new ImmutableTerminologyCapabilities_CodeSystem(version, extension, modifierExtension, subsumption, uri, id);
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean subsumptionIsSet() {
      return (optBits & OPT_BIT_SUBSUMPTION) != 0;
    }

    private boolean uriIsSet() {
      return (optBits & OPT_BIT_URI) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of TerminologyCapabilities_CodeSystem is strict, attribute is already set: ".concat(name));
    }
  }
}
