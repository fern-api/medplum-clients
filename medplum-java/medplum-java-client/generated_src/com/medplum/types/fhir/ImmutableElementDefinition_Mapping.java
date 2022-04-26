package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link ElementDefinition_Mapping}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableElementDefinition_Mapping.builder()}.
 */
@Generated(from = "ElementDefinition_Mapping", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableElementDefinition_Mapping
    implements ElementDefinition_Mapping {
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String map;
  private final @Nullable Code language;
  private final @Nullable Id identity;
  private final @Nullable String id;
  private final @Nullable String comment;

  private ImmutableElementDefinition_Mapping(
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable String map,
      @Nullable Code language,
      @Nullable Id identity,
      @Nullable String id,
      @Nullable String comment) {
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.map = map;
    this.language = language;
    this.identity = identity;
    this.id = id;
    this.comment = comment;
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code map} attribute
   */
  @JsonProperty("map")
  @Override
  public Optional<String> map() {
    return Optional.ofNullable(map);
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code identity} attribute
   */
  @JsonProperty("identity")
  @Override
  public Optional<Id> identity() {
    return Optional.ofNullable(identity);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code comment} attribute
   */
  @JsonProperty("comment")
  @Override
  public Optional<String> comment() {
    return Optional.ofNullable(comment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Mapping#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Mapping withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableElementDefinition_Mapping(newValue, this.modifierExtension, this.map, this.language, this.identity, this.id, this.comment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Mapping#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Mapping withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableElementDefinition_Mapping(value, this.modifierExtension, this.map, this.language, this.identity, this.id, this.comment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Mapping#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Mapping withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableElementDefinition_Mapping(this.extension, newValue, this.map, this.language, this.identity, this.id, this.comment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Mapping#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Mapping withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableElementDefinition_Mapping(this.extension, value, this.map, this.language, this.identity, this.id, this.comment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Mapping#map() map} attribute.
   * @param value The value for map
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Mapping withMap(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "map");
    if (Objects.equals(this.map, newValue)) return this;
    return new ImmutableElementDefinition_Mapping(
        this.extension,
        this.modifierExtension,
        newValue,
        this.language,
        this.identity,
        this.id,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Mapping#map() map} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for map
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Mapping withMap(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.map, value)) return this;
    return new ImmutableElementDefinition_Mapping(
        this.extension,
        this.modifierExtension,
        value,
        this.language,
        this.identity,
        this.id,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Mapping#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Mapping withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableElementDefinition_Mapping(
        this.extension,
        this.modifierExtension,
        this.map,
        newValue,
        this.identity,
        this.id,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Mapping#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Mapping withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableElementDefinition_Mapping(this.extension, this.modifierExtension, this.map, value, this.identity, this.id, this.comment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Mapping#identity() identity} attribute.
   * @param value The value for identity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Mapping withIdentity(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "identity");
    if (this.identity == newValue) return this;
    return new ImmutableElementDefinition_Mapping(
        this.extension,
        this.modifierExtension,
        this.map,
        this.language,
        newValue,
        this.id,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Mapping#identity() identity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Mapping withIdentity(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.identity == value) return this;
    return new ImmutableElementDefinition_Mapping(this.extension, this.modifierExtension, this.map, this.language, value, this.id, this.comment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Mapping#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Mapping withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableElementDefinition_Mapping(
        this.extension,
        this.modifierExtension,
        this.map,
        this.language,
        this.identity,
        newValue,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Mapping#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Mapping withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableElementDefinition_Mapping(
        this.extension,
        this.modifierExtension,
        this.map,
        this.language,
        this.identity,
        value,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Mapping#comment() comment} attribute.
   * @param value The value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Mapping withComment(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "comment");
    if (Objects.equals(this.comment, newValue)) return this;
    return new ImmutableElementDefinition_Mapping(
        this.extension,
        this.modifierExtension,
        this.map,
        this.language,
        this.identity,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Mapping#comment() comment} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Mapping withComment(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.comment, value)) return this;
    return new ImmutableElementDefinition_Mapping(this.extension, this.modifierExtension, this.map, this.language, this.identity, this.id, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableElementDefinition_Mapping} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableElementDefinition_Mapping
        && equalTo((ImmutableElementDefinition_Mapping) another);
  }

  private boolean equalTo(ImmutableElementDefinition_Mapping another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(map, another.map)
        && Objects.equals(language, another.language)
        && Objects.equals(identity, another.identity)
        && Objects.equals(id, another.id)
        && Objects.equals(comment, another.comment);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code modifierExtension}, {@code map}, {@code language}, {@code identity}, {@code id}, {@code comment}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(map);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(identity);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(comment);
    return h;
  }

  /**
   * Prints the immutable value {@code ElementDefinition_Mapping} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ElementDefinition_Mapping{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (map != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("map=").append(map);
    }
    if (language != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (identity != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("identity=").append(identity);
    }
    if (id != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (comment != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("comment=").append(comment);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ElementDefinition_Mapping", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ElementDefinition_Mapping {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> map = Optional.empty();
    boolean mapIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Id> identity = Optional.empty();
    boolean identityIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> comment = Optional.empty();
    boolean commentIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("map")
    public void setMap(Optional<String> map) {
      this.map = map;
      this.mapIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("identity")
    public void setIdentity(Optional<Id> identity) {
      this.identity = identity;
      this.identityIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("comment")
    public void setComment(Optional<String> comment) {
      this.comment = comment;
      this.commentIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> map() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> identity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> comment() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableElementDefinition_Mapping fromJson(Json json) {
    ImmutableElementDefinition_Mapping.Builder builder = ImmutableElementDefinition_Mapping.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.mapIsSet) {
      builder.map(json.map);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.identityIsSet) {
      builder.identity(json.identity);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.commentIsSet) {
      builder.comment(json.comment);
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
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .map(instance.map())
        .language(instance.language())
        .identity(instance.identity())
        .id(instance.id())
        .comment(instance.comment())
        .build();
  }

  /**
   * Creates a builder for {@link ElementDefinition_Mapping ElementDefinition_Mapping}.
   * <pre>
   * ImmutableElementDefinition_Mapping.builder()
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ElementDefinition_Mapping#extension() extension}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ElementDefinition_Mapping#modifierExtension() modifierExtension}
   *    .map(String) // optional {@link ElementDefinition_Mapping#map() map}
   *    .language(com.medplum.types.fhir.Code) // optional {@link ElementDefinition_Mapping#language() language}
   *    .identity(com.medplum.types.fhir.Id) // optional {@link ElementDefinition_Mapping#identity() identity}
   *    .id(String) // optional {@link ElementDefinition_Mapping#id() id}
   *    .comment(String) // optional {@link ElementDefinition_Mapping#comment() comment}
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
  @Generated(from = "ElementDefinition_Mapping", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_MAP = 0x4L;
    private static final long OPT_BIT_LANGUAGE = 0x8L;
    private static final long OPT_BIT_IDENTITY = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_COMMENT = 0x40L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String map;
    private @Nullable Code language;
    private @Nullable Id identity;
    private @Nullable String id;
    private @Nullable String comment;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Mapping#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(List<Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Mapping#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("extension")
    public final Builder extension(Optional<? extends List<Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Mapping#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(List<Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Mapping#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("modifierExtension")
    public final Builder modifierExtension(Optional<? extends List<Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Mapping#map() map} to map.
     * @param map The value for map
     * @return {@code this} builder for chained invocation
     */
    public final Builder map(String map) {
      checkNotIsSet(mapIsSet(), "map");
      this.map = Objects.requireNonNull(map, "map");
      optBits |= OPT_BIT_MAP;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Mapping#map() map} to map.
     * @param map The value for map
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("map")
    public final Builder map(Optional<String> map) {
      checkNotIsSet(mapIsSet(), "map");
      this.map = map.orElse(null);
      optBits |= OPT_BIT_MAP;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Mapping#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(Code language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Mapping#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("language")
    public final Builder language(Optional<? extends Code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Mapping#identity() identity} to identity.
     * @param identity The value for identity
     * @return {@code this} builder for chained invocation
     */
    public final Builder identity(Id identity) {
      checkNotIsSet(identityIsSet(), "identity");
      this.identity = Objects.requireNonNull(identity, "identity");
      optBits |= OPT_BIT_IDENTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Mapping#identity() identity} to identity.
     * @param identity The value for identity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identity")
    public final Builder identity(Optional<? extends Id> identity) {
      checkNotIsSet(identityIsSet(), "identity");
      this.identity = identity.orElse(null);
      optBits |= OPT_BIT_IDENTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Mapping#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Mapping#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<String> id) {
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
    public final Builder comment(String comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = Objects.requireNonNull(comment, "comment");
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Mapping#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("comment")
    public final Builder comment(Optional<String> comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = comment.orElse(null);
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Builds a new {@link ElementDefinition_Mapping ElementDefinition_Mapping}.
     * @return An immutable instance of ElementDefinition_Mapping
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ElementDefinition_Mapping build() {
      return new ImmutableElementDefinition_Mapping(extension, modifierExtension, map, language, identity, id, comment);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean mapIsSet() {
      return (optBits & OPT_BIT_MAP) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean identityIsSet() {
      return (optBits & OPT_BIT_IDENTITY) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean commentIsSet() {
      return (optBits & OPT_BIT_COMMENT) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ElementDefinition_Mapping is strict, attribute is already set: ".concat(name));
    }
  }
}
