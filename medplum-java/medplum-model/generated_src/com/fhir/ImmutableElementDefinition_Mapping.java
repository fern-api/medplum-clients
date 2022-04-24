//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ElementDefinition_Mapping}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableElementDefinition_Mapping.builder()}.
 */
@org.immutables.value.Generated(from = "ElementDefinition_Mapping", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableElementDefinition_Mapping implements com.fhir.ElementDefinition_Mapping {
  private final @javax.annotation.Nullable com.fhir.id identity;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.lang.String map;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.lang.String comment;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

  private ImmutableElementDefinition_Mapping(
      @javax.annotation.Nullable com.fhir.id identity,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.lang.String map,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.lang.String comment,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension) {
    this.identity = identity;
    this.extension = extension;
    this.language = language;
    this.map = map;
    this.id = id;
    this.comment = comment;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code identity} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identity")
  @Override
  public java.util.Optional<com.fhir.id> identity() {
    return java.util.Optional.ofNullable(identity);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code map} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("map")
  @Override
  public java.util.Optional<java.lang.String> map() {
    return java.util.Optional.ofNullable(map);
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
   * @return The value of the {@code comment} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("comment")
  @Override
  public java.util.Optional<java.lang.String> comment() {
    return java.util.Optional.ofNullable(comment);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Mapping#identity() identity} attribute.
   * @param value The value for identity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Mapping withIdentity(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "identity");
    if (this.identity == newValue) return this;
    return new ImmutableElementDefinition_Mapping(
        newValue,
        this.extension,
        this.language,
        this.map,
        this.id,
        this.comment,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Mapping#identity() identity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Mapping withIdentity(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.identity == value) return this;
    return new ImmutableElementDefinition_Mapping(value, this.extension, this.language, this.map, this.id, this.comment, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Mapping#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Mapping withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableElementDefinition_Mapping(this.identity, newValue, this.language, this.map, this.id, this.comment, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Mapping#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Mapping withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableElementDefinition_Mapping(this.identity, value, this.language, this.map, this.id, this.comment, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Mapping#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Mapping withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableElementDefinition_Mapping(
        this.identity,
        this.extension,
        newValue,
        this.map,
        this.id,
        this.comment,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Mapping#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Mapping withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableElementDefinition_Mapping(this.identity, this.extension, value, this.map, this.id, this.comment, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Mapping#map() map} attribute.
   * @param value The value for map
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Mapping withMap(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "map");
    if (java.util.Objects.equals(this.map, newValue)) return this;
    return new ImmutableElementDefinition_Mapping(
        this.identity,
        this.extension,
        this.language,
        newValue,
        this.id,
        this.comment,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Mapping#map() map} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for map
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Mapping withMap(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.map, value)) return this;
    return new ImmutableElementDefinition_Mapping(
        this.identity,
        this.extension,
        this.language,
        value,
        this.id,
        this.comment,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Mapping#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Mapping withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableElementDefinition_Mapping(
        this.identity,
        this.extension,
        this.language,
        this.map,
        newValue,
        this.comment,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Mapping#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Mapping withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableElementDefinition_Mapping(
        this.identity,
        this.extension,
        this.language,
        this.map,
        value,
        this.comment,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Mapping#comment() comment} attribute.
   * @param value The value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Mapping withComment(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "comment");
    if (java.util.Objects.equals(this.comment, newValue)) return this;
    return new ImmutableElementDefinition_Mapping(
        this.identity,
        this.extension,
        this.language,
        this.map,
        this.id,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Mapping#comment() comment} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Mapping withComment(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.comment, value)) return this;
    return new ImmutableElementDefinition_Mapping(this.identity, this.extension, this.language, this.map, this.id, value, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Mapping#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Mapping withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableElementDefinition_Mapping(this.identity, this.extension, this.language, this.map, this.id, this.comment, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Mapping#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Mapping withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableElementDefinition_Mapping(this.identity, this.extension, this.language, this.map, this.id, this.comment, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableElementDefinition_Mapping} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableElementDefinition_Mapping
        && equalTo((ImmutableElementDefinition_Mapping) another);
  }

  private boolean equalTo(ImmutableElementDefinition_Mapping another) {
    return java.util.Objects.equals(identity, another.identity)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(map, another.map)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(comment, another.comment)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code identity}, {@code extension}, {@code language}, {@code map}, {@code id}, {@code comment}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(identity);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(map);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(comment);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code ElementDefinition_Mapping} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ElementDefinition_Mapping{");
    if (identity != null) {
      builder.append("identity=").append(identity);
    }
    if (extension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (language != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (map != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("map=").append(map);
    }
    if (id != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (comment != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("comment=").append(comment);
    }
    if (modifierExtension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ElementDefinition_Mapping", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ElementDefinition_Mapping {
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> identity = java.util.Optional.empty();
    boolean identityIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> map = java.util.Optional.empty();
    boolean mapIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> comment = java.util.Optional.empty();
    boolean commentIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("identity")
    public void setIdentity(java.util.Optional<com.fhir.id> identity) {
      this.identity = identity;
      this.identityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("map")
    public void setMap(java.util.Optional<java.lang.String> map) {
      this.map = map;
      this.mapIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    public void setComment(java.util.Optional<java.lang.String> comment) {
      this.comment = comment;
      this.commentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.id> identity() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> map() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> comment() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableElementDefinition_Mapping fromJson(Json json) {
    ImmutableElementDefinition_Mapping.Builder builder = ImmutableElementDefinition_Mapping.builder();
    if (json.identityIsSet) {
      builder.identity(json.identity);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.mapIsSet) {
      builder.map(json.map);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.commentIsSet) {
      builder.comment(json.comment);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableElementDefinition_Mapping) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ElementDefinition_Mapping} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ElementDefinition_Mapping instance
   */
  public static ElementDefinition_Mapping copyOf(ElementDefinition_Mapping instance) {
    if (instance instanceof ImmutableElementDefinition_Mapping) {
      return (ImmutableElementDefinition_Mapping) instance;
    }
    return ImmutableElementDefinition_Mapping.builder()
        .identity(instance.identity())
        .extension(instance.extension())
        .language(instance.language())
        .map(instance.map())
        .id(instance.id())
        .comment(instance.comment())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link ElementDefinition_Mapping ElementDefinition_Mapping}.
   * <pre>
   * ImmutableElementDefinition_Mapping.builder()
   *    .identity(com.fhir.id) // optional {@link ElementDefinition_Mapping#identity() identity}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ElementDefinition_Mapping#extension() extension}
   *    .language(com.fhir.code) // optional {@link ElementDefinition_Mapping#language() language}
   *    .map(String) // optional {@link ElementDefinition_Mapping#map() map}
   *    .id(String) // optional {@link ElementDefinition_Mapping#id() id}
   *    .comment(String) // optional {@link ElementDefinition_Mapping#comment() comment}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ElementDefinition_Mapping#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new ElementDefinition_Mapping builder
   */
  public static ImmutableElementDefinition_Mapping.Builder builder() {
    return new ImmutableElementDefinition_Mapping.Builder();
  }

  /**
   * Builds instances of type {@link ElementDefinition_Mapping ElementDefinition_Mapping}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ElementDefinition_Mapping", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_IDENTITY = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_LANGUAGE = 0x4L;
    private static final long OPT_BIT_MAP = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_COMMENT = 0x20L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.id identity;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.lang.String map;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.lang.String comment;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Mapping#identity() identity} to identity.
     * @param identity The value for identity
     * @return {@code this} builder for chained invocation
     */
    public final Builder identity(com.fhir.id identity) {
      checkNotIsSet(identityIsSet(), "identity");
      this.identity = java.util.Objects.requireNonNull(identity, "identity");
      optBits |= OPT_BIT_IDENTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Mapping#identity() identity} to identity.
     * @param identity The value for identity
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identity")
    public final Builder identity(java.util.Optional<? extends com.fhir.id> identity) {
      checkNotIsSet(identityIsSet(), "identity");
      this.identity = identity.orElse(null);
      optBits |= OPT_BIT_IDENTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Mapping#extension() extension} to extension.
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
     * Initializes the optional value {@link ElementDefinition_Mapping#extension() extension} to extension.
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
     * Initializes the optional value {@link ElementDefinition_Mapping#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(com.fhir.code language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = java.util.Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Mapping#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public final Builder language(java.util.Optional<? extends com.fhir.code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Mapping#map() map} to map.
     * @param map The value for map
     * @return {@code this} builder for chained invocation
     */
    public final Builder map(java.lang.String map) {
      checkNotIsSet(mapIsSet(), "map");
      this.map = java.util.Objects.requireNonNull(map, "map");
      optBits |= OPT_BIT_MAP;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Mapping#map() map} to map.
     * @param map The value for map
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("map")
    public final Builder map(java.util.Optional<java.lang.String> map) {
      checkNotIsSet(mapIsSet(), "map");
      this.map = map.orElse(null);
      optBits |= OPT_BIT_MAP;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Mapping#id() id} to id.
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
     * Initializes the optional value {@link ElementDefinition_Mapping#id() id} to id.
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
     * Initializes the optional value {@link ElementDefinition_Mapping#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    public final Builder comment(java.lang.String comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = java.util.Objects.requireNonNull(comment, "comment");
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Mapping#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    public final Builder comment(java.util.Optional<java.lang.String> comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = comment.orElse(null);
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Mapping#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ElementDefinition_Mapping#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link ElementDefinition_Mapping ElementDefinition_Mapping}.
     * @return An immutable instance of ElementDefinition_Mapping
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ElementDefinition_Mapping build() {
      return new ImmutableElementDefinition_Mapping(identity, extension, language, map, id, comment, modifierExtension);
    }

    private boolean identityIsSet() {
      return (optBits & OPT_BIT_IDENTITY) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean mapIsSet() {
      return (optBits & OPT_BIT_MAP) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean commentIsSet() {
      return (optBits & OPT_BIT_COMMENT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ElementDefinition_Mapping is strict, attribute is already set: ".concat(name));
    }
  }
}
