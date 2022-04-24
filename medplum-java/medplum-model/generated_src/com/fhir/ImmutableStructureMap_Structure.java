//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link StructureMap_Structure}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableStructureMap_Structure.builder()}.
 */
@org.immutables.value.Generated(from = "StructureMap_Structure", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableStructureMap_Structure implements com.fhir.StructureMap_Structure {
  private final com.fhir.canonical url;
  private final @javax.annotation.Nullable java.lang.String documentation;
  private final @javax.annotation.Nullable com.fhir.Structuremap_structureMode mode;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.lang.String alias;

  private ImmutableStructureMap_Structure(
      com.fhir.canonical url,
      @javax.annotation.Nullable java.lang.String documentation,
      @javax.annotation.Nullable com.fhir.Structuremap_structureMode mode,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.lang.String alias) {
    this.url = url;
    this.documentation = documentation;
    this.mode = mode;
    this.id = id;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.alias = alias;
  }

  /**
   * @return The value of the {@code url} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("url")
  @Override
  public com.fhir.canonical url() {
    return url;
  }

  /**
   * @return The value of the {@code documentation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("documentation")
  @Override
  public java.util.Optional<java.lang.String> documentation() {
    return java.util.Optional.ofNullable(documentation);
  }

  /**
   * @return The value of the {@code mode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("mode")
  @Override
  public java.util.Optional<com.fhir.Structuremap_structureMode> mode() {
    return java.util.Optional.ofNullable(mode);
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
   * @return The value of the {@code alias} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("alias")
  @Override
  public java.util.Optional<java.lang.String> alias() {
    return java.util.Optional.ofNullable(alias);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link StructureMap_Structure#url() url} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for url
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableStructureMap_Structure withUrl(com.fhir.canonical value) {
    if (this.url == value) return this;
    com.fhir.canonical newValue = java.util.Objects.requireNonNull(value, "url");
    return new ImmutableStructureMap_Structure(
        newValue,
        this.documentation,
        this.mode,
        this.id,
        this.extension,
        this.modifierExtension,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Structure#documentation() documentation} attribute.
   * @param value The value for documentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Structure withDocumentation(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "documentation");
    if (java.util.Objects.equals(this.documentation, newValue)) return this;
    return new ImmutableStructureMap_Structure(this.url, newValue, this.mode, this.id, this.extension, this.modifierExtension, this.alias);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Structure#documentation() documentation} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for documentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Structure withDocumentation(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.documentation, value)) return this;
    return new ImmutableStructureMap_Structure(this.url, value, this.mode, this.id, this.extension, this.modifierExtension, this.alias);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Structure#mode() mode} attribute.
   * @param value The value for mode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Structure withMode(com.fhir.Structuremap_structureMode value) {
    @javax.annotation.Nullable com.fhir.Structuremap_structureMode newValue = java.util.Objects.requireNonNull(value, "mode");
    if (this.mode == newValue) return this;
    return new ImmutableStructureMap_Structure(
        this.url,
        this.documentation,
        newValue,
        this.id,
        this.extension,
        this.modifierExtension,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Structure#mode() mode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for mode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Structure withMode(java.util.Optional<? extends com.fhir.Structuremap_structureMode> optional) {
    @javax.annotation.Nullable com.fhir.Structuremap_structureMode value = optional.orElse(null);
    if (this.mode == value) return this;
    return new ImmutableStructureMap_Structure(
        this.url,
        this.documentation,
        value,
        this.id,
        this.extension,
        this.modifierExtension,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Structure#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Structure withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableStructureMap_Structure(
        this.url,
        this.documentation,
        this.mode,
        newValue,
        this.extension,
        this.modifierExtension,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Structure#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Structure withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableStructureMap_Structure(
        this.url,
        this.documentation,
        this.mode,
        value,
        this.extension,
        this.modifierExtension,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Structure#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Structure withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableStructureMap_Structure(this.url, this.documentation, this.mode, this.id, newValue, this.modifierExtension, this.alias);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Structure#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Structure withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableStructureMap_Structure(this.url, this.documentation, this.mode, this.id, value, this.modifierExtension, this.alias);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Structure#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Structure withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableStructureMap_Structure(this.url, this.documentation, this.mode, this.id, this.extension, newValue, this.alias);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Structure#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Structure withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableStructureMap_Structure(this.url, this.documentation, this.mode, this.id, this.extension, value, this.alias);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Structure#alias() alias} attribute.
   * @param value The value for alias
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Structure withAlias(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "alias");
    if (java.util.Objects.equals(this.alias, newValue)) return this;
    return new ImmutableStructureMap_Structure(
        this.url,
        this.documentation,
        this.mode,
        this.id,
        this.extension,
        this.modifierExtension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Structure#alias() alias} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for alias
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Structure withAlias(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.alias, value)) return this;
    return new ImmutableStructureMap_Structure(this.url, this.documentation, this.mode, this.id, this.extension, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableStructureMap_Structure} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableStructureMap_Structure
        && equalTo((ImmutableStructureMap_Structure) another);
  }

  private boolean equalTo(ImmutableStructureMap_Structure another) {
    return url.equals(another.url)
        && java.util.Objects.equals(documentation, another.documentation)
        && java.util.Objects.equals(mode, another.mode)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(alias, another.alias);
  }

  /**
   * Computes a hash code from attributes: {@code url}, {@code documentation}, {@code mode}, {@code id}, {@code extension}, {@code modifierExtension}, {@code alias}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + url.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(documentation);
    h += (h << 5) + java.util.Objects.hashCode(mode);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(alias);
    return h;
  }

  /**
   * Prints the immutable value {@code StructureMap_Structure} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("StructureMap_Structure{");
    builder.append("url=").append(url);
    if (documentation != null) {
      builder.append(", ");
      builder.append("documentation=").append(documentation);
    }
    if (mode != null) {
      builder.append(", ");
      builder.append("mode=").append(mode);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (alias != null) {
      builder.append(", ");
      builder.append("alias=").append(alias);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "StructureMap_Structure", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.StructureMap_Structure {
    @javax.annotation.Nullable com.fhir.canonical url;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> documentation = java.util.Optional.empty();
    boolean documentationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Structuremap_structureMode> mode = java.util.Optional.empty();
    boolean modeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> alias = java.util.Optional.empty();
    boolean aliasIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public void setUrl(com.fhir.canonical url) {
      this.url = url;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("documentation")
    public void setDocumentation(java.util.Optional<java.lang.String> documentation) {
      this.documentation = documentation;
      this.documentationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("mode")
    public void setMode(java.util.Optional<com.fhir.Structuremap_structureMode> mode) {
      this.mode = mode;
      this.modeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("alias")
    public void setAlias(java.util.Optional<java.lang.String> alias) {
      this.alias = alias;
      this.aliasIsSet = true;
    }
    @Override
    public com.fhir.canonical url() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> documentation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Structuremap_structureMode> mode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> alias() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableStructureMap_Structure fromJson(Json json) {
    ImmutableStructureMap_Structure.Builder builder = ((ImmutableStructureMap_Structure.Builder) ImmutableStructureMap_Structure.builder());
    if (json.url != null) {
      builder.url(json.url);
    }
    if (json.documentationIsSet) {
      builder.documentation(json.documentation);
    }
    if (json.modeIsSet) {
      builder.mode(json.mode);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.aliasIsSet) {
      builder.alias(json.alias);
    }
    return (ImmutableStructureMap_Structure) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link StructureMap_Structure} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable StructureMap_Structure instance
   */
  public static StructureMap_Structure copyOf(StructureMap_Structure instance) {
    if (instance instanceof ImmutableStructureMap_Structure) {
      return (ImmutableStructureMap_Structure) instance;
    }
    return ((ImmutableStructureMap_Structure.Builder) ImmutableStructureMap_Structure.builder())
        .url(instance.url())
        .documentation(instance.documentation())
        .mode(instance.mode())
        .id(instance.id())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .alias(instance.alias())
        .build();
  }

  /**
   * Creates a builder for {@link StructureMap_Structure StructureMap_Structure}.
   * <pre>
   * ImmutableStructureMap_Structure.builder()
   *    .url(com.fhir.canonical) // required {@link StructureMap_Structure#url() url}
   *    .documentation(String) // optional {@link StructureMap_Structure#documentation() documentation}
   *    .mode(com.fhir.Structuremap_structureMode) // optional {@link StructureMap_Structure#mode() mode}
   *    .id(String) // optional {@link StructureMap_Structure#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link StructureMap_Structure#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link StructureMap_Structure#modifierExtension() modifierExtension}
   *    .alias(String) // optional {@link StructureMap_Structure#alias() alias}
   *    .build();
   * </pre>
   * @return A new StructureMap_Structure builder
   */
  public static UrlBuildStage builder() {
    return new ImmutableStructureMap_Structure.Builder();
  }

  /**
   * Builds instances of type {@link StructureMap_Structure StructureMap_Structure}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "StructureMap_Structure", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements UrlBuildStage, BuildFinal {
    private static final long INIT_BIT_URL = 0x1L;
    private static final long OPT_BIT_DOCUMENTATION = 0x1L;
    private static final long OPT_BIT_MODE = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_ALIAS = 0x20L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.canonical url;
    private @javax.annotation.Nullable java.lang.String documentation;
    private @javax.annotation.Nullable com.fhir.Structuremap_structureMode mode;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String alias;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link StructureMap_Structure#url() url} attribute.
     * @param url The value for url 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public final Builder url(com.fhir.canonical url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = java.util.Objects.requireNonNull(url, "url");
      initBits &= ~INIT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Structure#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for chained invocation
     */
    public final Builder documentation(java.lang.String documentation) {
      checkNotIsSet(documentationIsSet(), "documentation");
      this.documentation = java.util.Objects.requireNonNull(documentation, "documentation");
      optBits |= OPT_BIT_DOCUMENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Structure#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("documentation")
    public final Builder documentation(java.util.Optional<java.lang.String> documentation) {
      checkNotIsSet(documentationIsSet(), "documentation");
      this.documentation = documentation.orElse(null);
      optBits |= OPT_BIT_DOCUMENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Structure#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for chained invocation
     */
    public final Builder mode(com.fhir.Structuremap_structureMode mode) {
      checkNotIsSet(modeIsSet(), "mode");
      this.mode = java.util.Objects.requireNonNull(mode, "mode");
      optBits |= OPT_BIT_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Structure#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mode")
    public final Builder mode(java.util.Optional<? extends com.fhir.Structuremap_structureMode> mode) {
      checkNotIsSet(modeIsSet(), "mode");
      this.mode = mode.orElse(null);
      optBits |= OPT_BIT_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Structure#id() id} to id.
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
     * Initializes the optional value {@link StructureMap_Structure#id() id} to id.
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
     * Initializes the optional value {@link StructureMap_Structure#extension() extension} to extension.
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
     * Initializes the optional value {@link StructureMap_Structure#extension() extension} to extension.
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
     * Initializes the optional value {@link StructureMap_Structure#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link StructureMap_Structure#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link StructureMap_Structure#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for chained invocation
     */
    public final Builder alias(java.lang.String alias) {
      checkNotIsSet(aliasIsSet(), "alias");
      this.alias = java.util.Objects.requireNonNull(alias, "alias");
      optBits |= OPT_BIT_ALIAS;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Structure#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("alias")
    public final Builder alias(java.util.Optional<java.lang.String> alias) {
      checkNotIsSet(aliasIsSet(), "alias");
      this.alias = alias.orElse(null);
      optBits |= OPT_BIT_ALIAS;
      return this;
    }

    /**
     * Builds a new {@link StructureMap_Structure StructureMap_Structure}.
     * @return An immutable instance of StructureMap_Structure
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.StructureMap_Structure build() {
      checkRequiredAttributes();
      return new ImmutableStructureMap_Structure(url, documentation, mode, id, extension, modifierExtension, alias);
    }

    private boolean documentationIsSet() {
      return (optBits & OPT_BIT_DOCUMENTATION) != 0;
    }

    private boolean modeIsSet() {
      return (optBits & OPT_BIT_MODE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean aliasIsSet() {
      return (optBits & OPT_BIT_ALIAS) != 0;
    }

    private boolean urlIsSet() {
      return (initBits & INIT_BIT_URL) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of StructureMap_Structure is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!urlIsSet()) attributes.add("url");
      return "Cannot build StructureMap_Structure, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "StructureMap_Structure", generator = "Immutables")
  public interface UrlBuildStage {
    /**
     * Initializes the value for the {@link StructureMap_Structure#url() url} attribute.
     * @param url The value for url 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(com.fhir.canonical url);
  }

  @org.immutables.value.Generated(from = "StructureMap_Structure", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link StructureMap_Structure#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal documentation(java.lang.String documentation);

    /**
     * Initializes the optional value {@link StructureMap_Structure#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal documentation(java.util.Optional<java.lang.String> documentation);

    /**
     * Initializes the optional value {@link StructureMap_Structure#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal mode(com.fhir.Structuremap_structureMode mode);

    /**
     * Initializes the optional value {@link StructureMap_Structure#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal mode(java.util.Optional<? extends com.fhir.Structuremap_structureMode> mode);

    /**
     * Initializes the optional value {@link StructureMap_Structure#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(java.lang.String id);

    /**
     * Initializes the optional value {@link StructureMap_Structure#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<java.lang.String> id);

    /**
     * Initializes the optional value {@link StructureMap_Structure#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link StructureMap_Structure#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link StructureMap_Structure#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link StructureMap_Structure#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link StructureMap_Structure#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for chained invocation
     */
    BuildFinal alias(java.lang.String alias);

    /**
     * Initializes the optional value {@link StructureMap_Structure#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal alias(java.util.Optional<java.lang.String> alias);

    /**
     * Builds a new {@link StructureMap_Structure StructureMap_Structure}.
     * @return An immutable instance of StructureMap_Structure
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    StructureMap_Structure build();
  }
}
