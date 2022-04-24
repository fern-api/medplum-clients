//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ImplementationGuide_DependsOn}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableImplementationGuide_DependsOn.builder()}.
 */
@org.immutables.value.Generated(from = "ImplementationGuide_DependsOn", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableImplementationGuide_DependsOn implements com.fhir.ImplementationGuide_DependsOn {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.id packageId;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final com.fhir.canonical uri;
  private final @javax.annotation.Nullable java.lang.String version;

  private ImmutableImplementationGuide_DependsOn(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.id packageId,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      com.fhir.canonical uri,
      @javax.annotation.Nullable java.lang.String version) {
    this.extension = extension;
    this.id = id;
    this.packageId = packageId;
    this.modifierExtension = modifierExtension;
    this.uri = uri;
    this.version = version;
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
   * @return The value of the {@code packageId} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("packageId")
  @Override
  public java.util.Optional<com.fhir.id> packageId() {
    return java.util.Optional.ofNullable(packageId);
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
   * @return The value of the {@code uri} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("uri")
  @Override
  public com.fhir.canonical uri() {
    return uri;
  }

  /**
   * @return The value of the {@code version} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("version")
  @Override
  public java.util.Optional<java.lang.String> version() {
    return java.util.Optional.ofNullable(version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_DependsOn#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_DependsOn withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableImplementationGuide_DependsOn(newValue, this.id, this.packageId, this.modifierExtension, this.uri, this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_DependsOn#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_DependsOn withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableImplementationGuide_DependsOn(value, this.id, this.packageId, this.modifierExtension, this.uri, this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_DependsOn#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_DependsOn withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableImplementationGuide_DependsOn(this.extension, newValue, this.packageId, this.modifierExtension, this.uri, this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_DependsOn#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_DependsOn withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableImplementationGuide_DependsOn(this.extension, value, this.packageId, this.modifierExtension, this.uri, this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_DependsOn#packageId() packageId} attribute.
   * @param value The value for packageId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_DependsOn withPackageId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "packageId");
    if (this.packageId == newValue) return this;
    return new ImmutableImplementationGuide_DependsOn(this.extension, this.id, newValue, this.modifierExtension, this.uri, this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_DependsOn#packageId() packageId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for packageId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_DependsOn withPackageId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.packageId == value) return this;
    return new ImmutableImplementationGuide_DependsOn(this.extension, this.id, value, this.modifierExtension, this.uri, this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_DependsOn#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_DependsOn withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableImplementationGuide_DependsOn(this.extension, this.id, this.packageId, newValue, this.uri, this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_DependsOn#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_DependsOn withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableImplementationGuide_DependsOn(this.extension, this.id, this.packageId, value, this.uri, this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ImplementationGuide_DependsOn#uri() uri} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for uri
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImplementationGuide_DependsOn withUri(com.fhir.canonical value) {
    if (this.uri == value) return this;
    com.fhir.canonical newValue = java.util.Objects.requireNonNull(value, "uri");
    return new ImmutableImplementationGuide_DependsOn(this.extension, this.id, this.packageId, this.modifierExtension, newValue, this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_DependsOn#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_DependsOn withVersion(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "version");
    if (java.util.Objects.equals(this.version, newValue)) return this;
    return new ImmutableImplementationGuide_DependsOn(this.extension, this.id, this.packageId, this.modifierExtension, this.uri, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_DependsOn#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_DependsOn withVersion(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.version, value)) return this;
    return new ImmutableImplementationGuide_DependsOn(this.extension, this.id, this.packageId, this.modifierExtension, this.uri, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableImplementationGuide_DependsOn} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableImplementationGuide_DependsOn
        && equalTo((ImmutableImplementationGuide_DependsOn) another);
  }

  private boolean equalTo(ImmutableImplementationGuide_DependsOn another) {
    return java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(packageId, another.packageId)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && uri.equals(another.uri)
        && java.util.Objects.equals(version, another.version);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code id}, {@code packageId}, {@code modifierExtension}, {@code uri}, {@code version}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(packageId);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + uri.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(version);
    return h;
  }

  /**
   * Prints the immutable value {@code ImplementationGuide_DependsOn} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ImplementationGuide_DependsOn{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (packageId != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("packageId=").append(packageId);
    }
    if (modifierExtension != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (builder.length() > 30) builder.append(", ");
    builder.append("uri=").append(uri);
    if (version != null) {
      builder.append(", ");
      builder.append("version=").append(version);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ImplementationGuide_DependsOn", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ImplementationGuide_DependsOn {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> packageId = java.util.Optional.empty();
    boolean packageIdIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable com.fhir.canonical uri;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> version = java.util.Optional.empty();
    boolean versionIsSet;
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
    @com.fasterxml.jackson.annotation.JsonProperty("packageId")
    public void setPackageId(java.util.Optional<com.fhir.id> packageId) {
      this.packageId = packageId;
      this.packageIdIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    public void setUri(com.fhir.canonical uri) {
      this.uri = uri;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public void setVersion(java.util.Optional<java.lang.String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> packageId() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.canonical uri() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> version() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableImplementationGuide_DependsOn fromJson(Json json) {
    ImmutableImplementationGuide_DependsOn.Builder builder = ((ImmutableImplementationGuide_DependsOn.Builder) ImmutableImplementationGuide_DependsOn.builder());
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.packageIdIsSet) {
      builder.packageId(json.packageId);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.uri != null) {
      builder.uri(json.uri);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    return (ImmutableImplementationGuide_DependsOn) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ImplementationGuide_DependsOn} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ImplementationGuide_DependsOn instance
   */
  public static ImplementationGuide_DependsOn copyOf(ImplementationGuide_DependsOn instance) {
    if (instance instanceof ImmutableImplementationGuide_DependsOn) {
      return (ImmutableImplementationGuide_DependsOn) instance;
    }
    return ((ImmutableImplementationGuide_DependsOn.Builder) ImmutableImplementationGuide_DependsOn.builder())
        .extension(instance.extension())
        .id(instance.id())
        .packageId(instance.packageId())
        .modifierExtension(instance.modifierExtension())
        .uri(instance.uri())
        .version(instance.version())
        .build();
  }

  /**
   * Creates a builder for {@link ImplementationGuide_DependsOn ImplementationGuide_DependsOn}.
   * <pre>
   * ImmutableImplementationGuide_DependsOn.builder()
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ImplementationGuide_DependsOn#extension() extension}
   *    .id(String) // optional {@link ImplementationGuide_DependsOn#id() id}
   *    .packageId(com.fhir.id) // optional {@link ImplementationGuide_DependsOn#packageId() packageId}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ImplementationGuide_DependsOn#modifierExtension() modifierExtension}
   *    .uri(com.fhir.canonical) // required {@link ImplementationGuide_DependsOn#uri() uri}
   *    .version(String) // optional {@link ImplementationGuide_DependsOn#version() version}
   *    .build();
   * </pre>
   * @return A new ImplementationGuide_DependsOn builder
   */
  public static UriBuildStage builder() {
    return new ImmutableImplementationGuide_DependsOn.Builder();
  }

  /**
   * Builds instances of type {@link ImplementationGuide_DependsOn ImplementationGuide_DependsOn}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ImplementationGuide_DependsOn", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements UriBuildStage, BuildFinal {
    private static final long INIT_BIT_URI = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_PACKAGE_ID = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_VERSION = 0x10L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.id packageId;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.canonical uri;
    private @javax.annotation.Nullable java.lang.String version;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_DependsOn#extension() extension} to extension.
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
     * Initializes the optional value {@link ImplementationGuide_DependsOn#extension() extension} to extension.
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
     * Initializes the optional value {@link ImplementationGuide_DependsOn#id() id} to id.
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
     * Initializes the optional value {@link ImplementationGuide_DependsOn#id() id} to id.
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
     * Initializes the optional value {@link ImplementationGuide_DependsOn#packageId() packageId} to packageId.
     * @param packageId The value for packageId
     * @return {@code this} builder for chained invocation
     */
    public final Builder packageId(com.fhir.id packageId) {
      checkNotIsSet(packageIdIsSet(), "packageId");
      this.packageId = java.util.Objects.requireNonNull(packageId, "packageId");
      optBits |= OPT_BIT_PACKAGE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_DependsOn#packageId() packageId} to packageId.
     * @param packageId The value for packageId
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("packageId")
    public final Builder packageId(java.util.Optional<? extends com.fhir.id> packageId) {
      checkNotIsSet(packageIdIsSet(), "packageId");
      this.packageId = packageId.orElse(null);
      optBits |= OPT_BIT_PACKAGE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_DependsOn#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImplementationGuide_DependsOn#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the value for the {@link ImplementationGuide_DependsOn#uri() uri} attribute.
     * @param uri The value for uri 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    public final Builder uri(com.fhir.canonical uri) {
      checkNotIsSet(uriIsSet(), "uri");
      this.uri = java.util.Objects.requireNonNull(uri, "uri");
      initBits &= ~INIT_BIT_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_DependsOn#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    public final Builder version(java.lang.String version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = java.util.Objects.requireNonNull(version, "version");
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_DependsOn#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public final Builder version(java.util.Optional<java.lang.String> version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = version.orElse(null);
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Builds a new {@link ImplementationGuide_DependsOn ImplementationGuide_DependsOn}.
     * @return An immutable instance of ImplementationGuide_DependsOn
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ImplementationGuide_DependsOn build() {
      checkRequiredAttributes();
      return new ImmutableImplementationGuide_DependsOn(extension, id, packageId, modifierExtension, uri, version);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean packageIdIsSet() {
      return (optBits & OPT_BIT_PACKAGE_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean uriIsSet() {
      return (initBits & INIT_BIT_URI) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ImplementationGuide_DependsOn is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!uriIsSet()) attributes.add("uri");
      return "Cannot build ImplementationGuide_DependsOn, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "ImplementationGuide_DependsOn", generator = "Immutables")
  public interface UriBuildStage {
    /**
     * Initializes the value for the {@link ImplementationGuide_DependsOn#uri() uri} attribute.
     * @param uri The value for uri 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal uri(com.fhir.canonical uri);
  }

  @org.immutables.value.Generated(from = "ImplementationGuide_DependsOn", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ImplementationGuide_DependsOn#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link ImplementationGuide_DependsOn#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link ImplementationGuide_DependsOn#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(java.lang.String id);

    /**
     * Initializes the optional value {@link ImplementationGuide_DependsOn#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<java.lang.String> id);

    /**
     * Initializes the optional value {@link ImplementationGuide_DependsOn#packageId() packageId} to packageId.
     * @param packageId The value for packageId
     * @return {@code this} builder for chained invocation
     */
    BuildFinal packageId(com.fhir.id packageId);

    /**
     * Initializes the optional value {@link ImplementationGuide_DependsOn#packageId() packageId} to packageId.
     * @param packageId The value for packageId
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal packageId(java.util.Optional<? extends com.fhir.id> packageId);

    /**
     * Initializes the optional value {@link ImplementationGuide_DependsOn#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ImplementationGuide_DependsOn#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ImplementationGuide_DependsOn#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(java.lang.String version);

    /**
     * Initializes the optional value {@link ImplementationGuide_DependsOn#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(java.util.Optional<java.lang.String> version);

    /**
     * Builds a new {@link ImplementationGuide_DependsOn ImplementationGuide_DependsOn}.
     * @return An immutable instance of ImplementationGuide_DependsOn
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ImplementationGuide_DependsOn build();
  }
}
