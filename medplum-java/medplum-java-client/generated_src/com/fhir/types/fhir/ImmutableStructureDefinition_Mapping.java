package com.fhir.types.fhir;

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
 * Immutable implementation of {@link StructureDefinition_Mapping}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableStructureDefinition_Mapping.builder()}.
 */
@Generated(from = "StructureDefinition_Mapping", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableStructureDefinition_Mapping
    implements StructureDefinition_Mapping {
  private final @Nullable String name;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final @Nullable Id identity;
  private final @Nullable List<Extension> extension;
  private final @Nullable Uri uri;
  private final @Nullable String comment;

  private ImmutableStructureDefinition_Mapping(
      @Nullable String name,
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      @Nullable Id identity,
      @Nullable List<Extension> extension,
      @Nullable Uri uri,
      @Nullable String comment) {
    this.name = name;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.identity = identity;
    this.extension = extension;
    this.uri = uri;
    this.comment = comment;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return Optional.ofNullable(name);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code uri} attribute
   */
  @JsonProperty("uri")
  @Override
  public Optional<Uri> uri() {
    return Optional.ofNullable(uri);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition_Mapping#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition_Mapping withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableStructureDefinition_Mapping(
        newValue,
        this.modifierExtension,
        this.id,
        this.identity,
        this.extension,
        this.uri,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition_Mapping#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition_Mapping withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableStructureDefinition_Mapping(value, this.modifierExtension, this.id, this.identity, this.extension, this.uri, this.comment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition_Mapping#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition_Mapping withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableStructureDefinition_Mapping(this.name, newValue, this.id, this.identity, this.extension, this.uri, this.comment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition_Mapping#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition_Mapping withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableStructureDefinition_Mapping(this.name, value, this.id, this.identity, this.extension, this.uri, this.comment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition_Mapping#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition_Mapping withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableStructureDefinition_Mapping(
        this.name,
        this.modifierExtension,
        newValue,
        this.identity,
        this.extension,
        this.uri,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition_Mapping#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition_Mapping withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableStructureDefinition_Mapping(this.name, this.modifierExtension, value, this.identity, this.extension, this.uri, this.comment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition_Mapping#identity() identity} attribute.
   * @param value The value for identity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition_Mapping withIdentity(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "identity");
    if (this.identity == newValue) return this;
    return new ImmutableStructureDefinition_Mapping(this.name, this.modifierExtension, this.id, newValue, this.extension, this.uri, this.comment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition_Mapping#identity() identity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition_Mapping withIdentity(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.identity == value) return this;
    return new ImmutableStructureDefinition_Mapping(this.name, this.modifierExtension, this.id, value, this.extension, this.uri, this.comment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition_Mapping#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition_Mapping withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableStructureDefinition_Mapping(this.name, this.modifierExtension, this.id, this.identity, newValue, this.uri, this.comment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition_Mapping#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition_Mapping withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableStructureDefinition_Mapping(this.name, this.modifierExtension, this.id, this.identity, value, this.uri, this.comment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition_Mapping#uri() uri} attribute.
   * @param value The value for uri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition_Mapping withUri(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "uri");
    if (this.uri == newValue) return this;
    return new ImmutableStructureDefinition_Mapping(
        this.name,
        this.modifierExtension,
        this.id,
        this.identity,
        this.extension,
        newValue,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition_Mapping#uri() uri} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for uri
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition_Mapping withUri(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.uri == value) return this;
    return new ImmutableStructureDefinition_Mapping(this.name, this.modifierExtension, this.id, this.identity, this.extension, value, this.comment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition_Mapping#comment() comment} attribute.
   * @param value The value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition_Mapping withComment(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "comment");
    if (Objects.equals(this.comment, newValue)) return this;
    return new ImmutableStructureDefinition_Mapping(this.name, this.modifierExtension, this.id, this.identity, this.extension, this.uri, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition_Mapping#comment() comment} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition_Mapping withComment(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.comment, value)) return this;
    return new ImmutableStructureDefinition_Mapping(this.name, this.modifierExtension, this.id, this.identity, this.extension, this.uri, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableStructureDefinition_Mapping} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableStructureDefinition_Mapping
        && equalTo((ImmutableStructureDefinition_Mapping) another);
  }

  private boolean equalTo(ImmutableStructureDefinition_Mapping another) {
    return Objects.equals(name, another.name)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(identity, another.identity)
        && Objects.equals(extension, another.extension)
        && Objects.equals(uri, another.uri)
        && Objects.equals(comment, another.comment);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code modifierExtension}, {@code id}, {@code identity}, {@code extension}, {@code uri}, {@code comment}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(identity);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(uri);
    h += (h << 5) + Objects.hashCode(comment);
    return h;
  }

  /**
   * Prints the immutable value {@code StructureDefinition_Mapping} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("StructureDefinition_Mapping{");
    if (name != null) {
      builder.append("name=").append(name);
    }
    if (modifierExtension != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (identity != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("identity=").append(identity);
    }
    if (extension != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (uri != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("uri=").append(uri);
    }
    if (comment != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("comment=").append(comment);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "StructureDefinition_Mapping", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements StructureDefinition_Mapping {
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Id> identity = Optional.empty();
    boolean identityIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Uri> uri = Optional.empty();
    boolean uriIsSet;
    @Nullable Optional<String> comment = Optional.empty();
    boolean commentIsSet;
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("identity")
    public void setIdentity(Optional<Id> identity) {
      this.identity = identity;
      this.identityIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("uri")
    public void setUri(Optional<Uri> uri) {
      this.uri = uri;
      this.uriIsSet = true;
    }
    @JsonProperty("comment")
    public void setComment(Optional<String> comment) {
      this.comment = comment;
      this.commentIsSet = true;
    }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> identity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> uri() { throw new UnsupportedOperationException(); }
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
  static ImmutableStructureDefinition_Mapping fromJson(Json json) {
    ImmutableStructureDefinition_Mapping.Builder builder = ImmutableStructureDefinition_Mapping.builder();
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.identityIsSet) {
      builder.identity(json.identity);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.uriIsSet) {
      builder.uri(json.uri);
    }
    if (json.commentIsSet) {
      builder.comment(json.comment);
    }
    return (ImmutableStructureDefinition_Mapping) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link StructureDefinition_Mapping} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable StructureDefinition_Mapping instance
   */
  public static StructureDefinition_Mapping copyOf(StructureDefinition_Mapping instance) {
    if (instance instanceof ImmutableStructureDefinition_Mapping) {
      return (ImmutableStructureDefinition_Mapping) instance;
    }
    return ImmutableStructureDefinition_Mapping.builder()
        .name(instance.name())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .identity(instance.identity())
        .extension(instance.extension())
        .uri(instance.uri())
        .comment(instance.comment())
        .build();
  }

  /**
   * Creates a builder for {@link StructureDefinition_Mapping StructureDefinition_Mapping}.
   * <pre>
   * ImmutableStructureDefinition_Mapping.builder()
   *    .name(String) // optional {@link StructureDefinition_Mapping#name() name}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link StructureDefinition_Mapping#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link StructureDefinition_Mapping#id() id}
   *    .identity(com.fhir.types.fhir.Id) // optional {@link StructureDefinition_Mapping#identity() identity}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link StructureDefinition_Mapping#extension() extension}
   *    .uri(com.fhir.types.fhir.Uri) // optional {@link StructureDefinition_Mapping#uri() uri}
   *    .comment(String) // optional {@link StructureDefinition_Mapping#comment() comment}
   *    .build();
   * </pre>
   * @return A new StructureDefinition_Mapping builder
   */
  public static ImmutableStructureDefinition_Mapping.Builder builder() {
    return new ImmutableStructureDefinition_Mapping.Builder();
  }

  /**
   * Builds instances of type {@link StructureDefinition_Mapping StructureDefinition_Mapping}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "StructureDefinition_Mapping", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_NAME = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_IDENTITY = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_URI = 0x20L;
    private static final long OPT_BIT_COMMENT = 0x40L;
    private long optBits;

    private @Nullable String name;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable Id identity;
    private @Nullable List<Extension> extension;
    private @Nullable Uri uri;
    private @Nullable String comment;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link StructureDefinition_Mapping#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition_Mapping#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(Optional<String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition_Mapping#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link StructureDefinition_Mapping#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link StructureDefinition_Mapping#id() id} to id.
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
     * Initializes the optional value {@link StructureDefinition_Mapping#id() id} to id.
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
     * Initializes the optional value {@link StructureDefinition_Mapping#identity() identity} to identity.
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
     * Initializes the optional value {@link StructureDefinition_Mapping#identity() identity} to identity.
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
     * Initializes the optional value {@link StructureDefinition_Mapping#extension() extension} to extension.
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
     * Initializes the optional value {@link StructureDefinition_Mapping#extension() extension} to extension.
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
     * Initializes the optional value {@link StructureDefinition_Mapping#uri() uri} to uri.
     * @param uri The value for uri
     * @return {@code this} builder for chained invocation
     */
    public final Builder uri(Uri uri) {
      checkNotIsSet(uriIsSet(), "uri");
      this.uri = Objects.requireNonNull(uri, "uri");
      optBits |= OPT_BIT_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition_Mapping#uri() uri} to uri.
     * @param uri The value for uri
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("uri")
    public final Builder uri(Optional<? extends Uri> uri) {
      checkNotIsSet(uriIsSet(), "uri");
      this.uri = uri.orElse(null);
      optBits |= OPT_BIT_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition_Mapping#comment() comment} to comment.
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
     * Initializes the optional value {@link StructureDefinition_Mapping#comment() comment} to comment.
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
     * Builds a new {@link StructureDefinition_Mapping StructureDefinition_Mapping}.
     * @return An immutable instance of StructureDefinition_Mapping
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public StructureDefinition_Mapping build() {
      return new ImmutableStructureDefinition_Mapping(name, modifierExtension, id, identity, extension, uri, comment);
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean identityIsSet() {
      return (optBits & OPT_BIT_IDENTITY) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean uriIsSet() {
      return (optBits & OPT_BIT_URI) != 0;
    }

    private boolean commentIsSet() {
      return (optBits & OPT_BIT_COMMENT) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of StructureDefinition_Mapping is strict, attribute is already set: ".concat(name));
    }
  }
}
