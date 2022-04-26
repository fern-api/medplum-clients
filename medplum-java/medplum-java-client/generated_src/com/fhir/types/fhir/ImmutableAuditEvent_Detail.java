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
 * Immutable implementation of {@link AuditEvent_Detail}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAuditEvent_Detail.builder()}.
 */
@Generated(from = "AuditEvent_Detail", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableAuditEvent_Detail implements AuditEvent_Detail {
  private final @Nullable String valueBase64Binary;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;
  private final @Nullable String type;
  private final @Nullable String valueString;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableAuditEvent_Detail(
      @Nullable String valueBase64Binary,
      @Nullable List<Extension> extension,
      @Nullable String id,
      @Nullable String type,
      @Nullable String valueString,
      @Nullable List<Extension> modifierExtension) {
    this.valueBase64Binary = valueBase64Binary;
    this.extension = extension;
    this.id = id;
    this.type = type;
    this.valueString = valueString;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code valueBase64Binary} attribute
   */
  @JsonProperty("valueBase64Binary")
  @Override
  public Optional<String> valueBase64Binary() {
    return Optional.ofNullable(valueBase64Binary);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<String> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code valueString} attribute
   */
  @JsonProperty("valueString")
  @Override
  public Optional<String> valueString() {
    return Optional.ofNullable(valueString);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Detail#valueBase64Binary() valueBase64Binary} attribute.
   * @param value The value for valueBase64Binary
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Detail withValueBase64Binary(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueBase64Binary");
    if (Objects.equals(this.valueBase64Binary, newValue)) return this;
    return new ImmutableAuditEvent_Detail(newValue, this.extension, this.id, this.type, this.valueString, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Detail#valueBase64Binary() valueBase64Binary} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueBase64Binary
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Detail withValueBase64Binary(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueBase64Binary, value)) return this;
    return new ImmutableAuditEvent_Detail(value, this.extension, this.id, this.type, this.valueString, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Detail#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Detail withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableAuditEvent_Detail(this.valueBase64Binary, newValue, this.id, this.type, this.valueString, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Detail#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent_Detail withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableAuditEvent_Detail(this.valueBase64Binary, value, this.id, this.type, this.valueString, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Detail#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Detail withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableAuditEvent_Detail(
        this.valueBase64Binary,
        this.extension,
        newValue,
        this.type,
        this.valueString,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Detail#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Detail withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableAuditEvent_Detail(
        this.valueBase64Binary,
        this.extension,
        value,
        this.type,
        this.valueString,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Detail#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Detail withType(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "type");
    if (Objects.equals(this.type, newValue)) return this;
    return new ImmutableAuditEvent_Detail(
        this.valueBase64Binary,
        this.extension,
        this.id,
        newValue,
        this.valueString,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Detail#type() type} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Detail withType(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.type, value)) return this;
    return new ImmutableAuditEvent_Detail(
        this.valueBase64Binary,
        this.extension,
        this.id,
        value,
        this.valueString,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Detail#valueString() valueString} attribute.
   * @param value The value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Detail withValueString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueString");
    if (Objects.equals(this.valueString, newValue)) return this;
    return new ImmutableAuditEvent_Detail(this.valueBase64Binary, this.extension, this.id, this.type, newValue, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Detail#valueString() valueString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Detail withValueString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueString, value)) return this;
    return new ImmutableAuditEvent_Detail(this.valueBase64Binary, this.extension, this.id, this.type, value, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Detail#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Detail withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableAuditEvent_Detail(this.valueBase64Binary, this.extension, this.id, this.type, this.valueString, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Detail#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent_Detail withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableAuditEvent_Detail(this.valueBase64Binary, this.extension, this.id, this.type, this.valueString, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAuditEvent_Detail} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAuditEvent_Detail
        && equalTo((ImmutableAuditEvent_Detail) another);
  }

  private boolean equalTo(ImmutableAuditEvent_Detail another) {
    return Objects.equals(valueBase64Binary, another.valueBase64Binary)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && Objects.equals(type, another.type)
        && Objects.equals(valueString, another.valueString)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code valueBase64Binary}, {@code extension}, {@code id}, {@code type}, {@code valueString}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(valueBase64Binary);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(valueString);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code AuditEvent_Detail} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("AuditEvent_Detail{");
    if (valueBase64Binary != null) {
      builder.append("valueBase64Binary=").append(valueBase64Binary);
    }
    if (extension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (type != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (valueString != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("valueString=").append(valueString);
    }
    if (modifierExtension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "AuditEvent_Detail", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements AuditEvent_Detail {
    @Nullable Optional<String> valueBase64Binary = Optional.empty();
    boolean valueBase64BinaryIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<String> valueString = Optional.empty();
    boolean valueStringIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("valueBase64Binary")
    public void setValueBase64Binary(Optional<String> valueBase64Binary) {
      this.valueBase64Binary = valueBase64Binary;
      this.valueBase64BinaryIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<String> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("valueString")
    public void setValueString(Optional<String> valueString) {
      this.valueString = valueString;
      this.valueStringIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<String> valueBase64Binary() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAuditEvent_Detail fromJson(Json json) {
    ImmutableAuditEvent_Detail.Builder builder = ImmutableAuditEvent_Detail.builder();
    if (json.valueBase64BinaryIsSet) {
      builder.valueBase64Binary(json.valueBase64Binary);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.valueStringIsSet) {
      builder.valueString(json.valueString);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableAuditEvent_Detail) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AuditEvent_Detail} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AuditEvent_Detail instance
   */
  public static AuditEvent_Detail copyOf(AuditEvent_Detail instance) {
    if (instance instanceof ImmutableAuditEvent_Detail) {
      return (ImmutableAuditEvent_Detail) instance;
    }
    return ImmutableAuditEvent_Detail.builder()
        .valueBase64Binary(instance.valueBase64Binary())
        .extension(instance.extension())
        .id(instance.id())
        .type(instance.type())
        .valueString(instance.valueString())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link AuditEvent_Detail AuditEvent_Detail}.
   * <pre>
   * ImmutableAuditEvent_Detail.builder()
   *    .valueBase64Binary(String) // optional {@link AuditEvent_Detail#valueBase64Binary() valueBase64Binary}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link AuditEvent_Detail#extension() extension}
   *    .id(String) // optional {@link AuditEvent_Detail#id() id}
   *    .type(String) // optional {@link AuditEvent_Detail#type() type}
   *    .valueString(String) // optional {@link AuditEvent_Detail#valueString() valueString}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link AuditEvent_Detail#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new AuditEvent_Detail builder
   */
  public static ImmutableAuditEvent_Detail.Builder builder() {
    return new ImmutableAuditEvent_Detail.Builder();
  }

  /**
   * Builds instances of type {@link AuditEvent_Detail AuditEvent_Detail}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "AuditEvent_Detail", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_VALUE_BASE64_BINARY = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_TYPE = 0x8L;
    private static final long OPT_BIT_VALUE_STRING = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private long optBits;

    private @Nullable String valueBase64Binary;
    private @Nullable List<Extension> extension;
    private @Nullable String id;
    private @Nullable String type;
    private @Nullable String valueString;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link AuditEvent_Detail#valueBase64Binary() valueBase64Binary} to valueBase64Binary.
     * @param valueBase64Binary The value for valueBase64Binary
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueBase64Binary(String valueBase64Binary) {
      checkNotIsSet(valueBase64BinaryIsSet(), "valueBase64Binary");
      this.valueBase64Binary = Objects.requireNonNull(valueBase64Binary, "valueBase64Binary");
      optBits |= OPT_BIT_VALUE_BASE64_BINARY;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Detail#valueBase64Binary() valueBase64Binary} to valueBase64Binary.
     * @param valueBase64Binary The value for valueBase64Binary
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueBase64Binary")
    public final Builder valueBase64Binary(Optional<String> valueBase64Binary) {
      checkNotIsSet(valueBase64BinaryIsSet(), "valueBase64Binary");
      this.valueBase64Binary = valueBase64Binary.orElse(null);
      optBits |= OPT_BIT_VALUE_BASE64_BINARY;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Detail#extension() extension} to extension.
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
     * Initializes the optional value {@link AuditEvent_Detail#extension() extension} to extension.
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
     * Initializes the optional value {@link AuditEvent_Detail#id() id} to id.
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
     * Initializes the optional value {@link AuditEvent_Detail#id() id} to id.
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
     * Initializes the optional value {@link AuditEvent_Detail#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(String type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Detail#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<String> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Detail#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueString(String valueString) {
      checkNotIsSet(valueStringIsSet(), "valueString");
      this.valueString = Objects.requireNonNull(valueString, "valueString");
      optBits |= OPT_BIT_VALUE_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Detail#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueString")
    public final Builder valueString(Optional<String> valueString) {
      checkNotIsSet(valueStringIsSet(), "valueString");
      this.valueString = valueString.orElse(null);
      optBits |= OPT_BIT_VALUE_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Detail#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link AuditEvent_Detail#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link AuditEvent_Detail AuditEvent_Detail}.
     * @return An immutable instance of AuditEvent_Detail
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public AuditEvent_Detail build() {
      return new ImmutableAuditEvent_Detail(valueBase64Binary, extension, id, type, valueString, modifierExtension);
    }

    private boolean valueBase64BinaryIsSet() {
      return (optBits & OPT_BIT_VALUE_BASE64_BINARY) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean valueStringIsSet() {
      return (optBits & OPT_BIT_VALUE_STRING) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of AuditEvent_Detail is strict, attribute is already set: ".concat(name));
    }
  }
}
