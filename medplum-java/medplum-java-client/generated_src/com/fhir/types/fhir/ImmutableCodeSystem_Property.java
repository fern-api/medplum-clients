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
 * Immutable implementation of {@link CodeSystem_Property}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCodeSystem_Property.builder()}.
 */
@Generated(from = "CodeSystem_Property", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCodeSystem_Property implements CodeSystem_Property {
  private final @Nullable List<Extension> extension;
  private final @Nullable Codesystem_PropertyType type;
  private final @Nullable String id;
  private final @Nullable Code code;
  private final @Nullable String description;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Uri uri;

  private ImmutableCodeSystem_Property(
      @Nullable List<Extension> extension,
      @Nullable Codesystem_PropertyType type,
      @Nullable String id,
      @Nullable Code code,
      @Nullable String description,
      @Nullable List<Extension> modifierExtension,
      @Nullable Uri uri) {
    this.extension = extension;
    this.type = type;
    this.id = id;
    this.code = code;
    this.description = description;
    this.modifierExtension = modifierExtension;
    this.uri = uri;
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<Codesystem_PropertyType> type() {
    return Optional.ofNullable(type);
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
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<Code> code() {
    return Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
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
   * @return The value of the {@code uri} attribute
   */
  @JsonProperty("uri")
  @Override
  public Optional<Uri> uri() {
    return Optional.ofNullable(uri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Property#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCodeSystem_Property(newValue, this.type, this.id, this.code, this.description, this.modifierExtension, this.uri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Property#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem_Property withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCodeSystem_Property(value, this.type, this.id, this.code, this.description, this.modifierExtension, this.uri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Property#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property withType(Codesystem_PropertyType value) {
    @Nullable Codesystem_PropertyType newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableCodeSystem_Property(
        this.extension,
        newValue,
        this.id,
        this.code,
        this.description,
        this.modifierExtension,
        this.uri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Property#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem_Property withType(Optional<? extends Codesystem_PropertyType> optional) {
    @Nullable Codesystem_PropertyType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableCodeSystem_Property(this.extension, value, this.id, this.code, this.description, this.modifierExtension, this.uri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Property#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableCodeSystem_Property(
        this.extension,
        this.type,
        newValue,
        this.code,
        this.description,
        this.modifierExtension,
        this.uri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Property#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableCodeSystem_Property(this.extension, this.type, value, this.code, this.description, this.modifierExtension, this.uri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Property#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property withCode(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableCodeSystem_Property(
        this.extension,
        this.type,
        this.id,
        newValue,
        this.description,
        this.modifierExtension,
        this.uri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Property#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem_Property withCode(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableCodeSystem_Property(this.extension, this.type, this.id, value, this.description, this.modifierExtension, this.uri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Property#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableCodeSystem_Property(this.extension, this.type, this.id, this.code, newValue, this.modifierExtension, this.uri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Property#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableCodeSystem_Property(this.extension, this.type, this.id, this.code, value, this.modifierExtension, this.uri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Property#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCodeSystem_Property(this.extension, this.type, this.id, this.code, this.description, newValue, this.uri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Property#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem_Property withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCodeSystem_Property(this.extension, this.type, this.id, this.code, this.description, value, this.uri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Property#uri() uri} attribute.
   * @param value The value for uri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Property withUri(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "uri");
    if (this.uri == newValue) return this;
    return new ImmutableCodeSystem_Property(
        this.extension,
        this.type,
        this.id,
        this.code,
        this.description,
        this.modifierExtension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Property#uri() uri} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for uri
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem_Property withUri(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.uri == value) return this;
    return new ImmutableCodeSystem_Property(this.extension, this.type, this.id, this.code, this.description, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCodeSystem_Property} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCodeSystem_Property
        && equalTo((ImmutableCodeSystem_Property) another);
  }

  private boolean equalTo(ImmutableCodeSystem_Property another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(type, another.type)
        && Objects.equals(id, another.id)
        && Objects.equals(code, another.code)
        && Objects.equals(description, another.description)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(uri, another.uri);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code type}, {@code id}, {@code code}, {@code description}, {@code modifierExtension}, {@code uri}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(uri);
    return h;
  }

  /**
   * Prints the immutable value {@code CodeSystem_Property} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("CodeSystem_Property{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (type != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (id != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (code != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (description != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (modifierExtension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (uri != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("uri=").append(uri);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "CodeSystem_Property", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements CodeSystem_Property {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Codesystem_PropertyType> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Code> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Uri> uri = Optional.empty();
    boolean uriIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<Codesystem_PropertyType> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<Code> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("uri")
    public void setUri(Optional<Uri> uri) {
      this.uri = uri;
      this.uriIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Codesystem_PropertyType> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> uri() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCodeSystem_Property fromJson(Json json) {
    ImmutableCodeSystem_Property.Builder builder = ImmutableCodeSystem_Property.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.uriIsSet) {
      builder.uri(json.uri);
    }
    return (ImmutableCodeSystem_Property) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CodeSystem_Property} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CodeSystem_Property instance
   */
  public static CodeSystem_Property copyOf(CodeSystem_Property instance) {
    if (instance instanceof ImmutableCodeSystem_Property) {
      return (ImmutableCodeSystem_Property) instance;
    }
    return ImmutableCodeSystem_Property.builder()
        .extension(instance.extension())
        .type(instance.type())
        .id(instance.id())
        .code(instance.code())
        .description(instance.description())
        .modifierExtension(instance.modifierExtension())
        .uri(instance.uri())
        .build();
  }

  /**
   * Creates a builder for {@link CodeSystem_Property CodeSystem_Property}.
   * <pre>
   * ImmutableCodeSystem_Property.builder()
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link CodeSystem_Property#extension() extension}
   *    .type(Codesystem_PropertyType) // optional {@link CodeSystem_Property#type() type}
   *    .id(String) // optional {@link CodeSystem_Property#id() id}
   *    .code(com.fhir.types.fhir.Code) // optional {@link CodeSystem_Property#code() code}
   *    .description(String) // optional {@link CodeSystem_Property#description() description}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link CodeSystem_Property#modifierExtension() modifierExtension}
   *    .uri(com.fhir.types.fhir.Uri) // optional {@link CodeSystem_Property#uri() uri}
   *    .build();
   * </pre>
   * @return A new CodeSystem_Property builder
   */
  public static ImmutableCodeSystem_Property.Builder builder() {
    return new ImmutableCodeSystem_Property.Builder();
  }

  /**
   * Builds instances of type {@link CodeSystem_Property CodeSystem_Property}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "CodeSystem_Property", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_TYPE = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_CODE = 0x8L;
    private static final long OPT_BIT_DESCRIPTION = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_URI = 0x40L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable Codesystem_PropertyType type;
    private @Nullable String id;
    private @Nullable Code code;
    private @Nullable String description;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Uri uri;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CodeSystem_Property#extension() extension} to extension.
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
     * Initializes the optional value {@link CodeSystem_Property#extension() extension} to extension.
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
     * Initializes the optional value {@link CodeSystem_Property#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(Codesystem_PropertyType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Property#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends Codesystem_PropertyType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Property#id() id} to id.
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
     * Initializes the optional value {@link CodeSystem_Property#id() id} to id.
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
     * Initializes the optional value {@link CodeSystem_Property#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(Code code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Property#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends Code> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Property#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Property#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(Optional<String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Property#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CodeSystem_Property#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CodeSystem_Property#uri() uri} to uri.
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
     * Initializes the optional value {@link CodeSystem_Property#uri() uri} to uri.
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
     * Builds a new {@link CodeSystem_Property CodeSystem_Property}.
     * @return An immutable instance of CodeSystem_Property
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public CodeSystem_Property build() {
      return new ImmutableCodeSystem_Property(extension, type, id, code, description, modifierExtension, uri);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean uriIsSet() {
      return (optBits & OPT_BIT_URI) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of CodeSystem_Property is strict, attribute is already set: ".concat(name));
    }
  }
}
