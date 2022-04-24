package com.fhir;

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
 * Immutable implementation of {@link TestScript_RequestHeader}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTestScript_RequestHeader.builder()}.
 */
@Generated(from = "TestScript_RequestHeader", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTestScript_RequestHeader implements TestScript_RequestHeader {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;
  private final @Nullable String field;
  private final @Nullable String value;

  private ImmutableTestScript_RequestHeader(
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension,
      @Nullable String id,
      @Nullable String field,
      @Nullable String value) {
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.id = id;
    this.field = field;
    this.value = value;
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
   * @return The value of the {@code field} attribute
   */
  @JsonProperty("field")
  @Override
  public Optional<String> field() {
    return Optional.ofNullable(field);
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @JsonProperty("value")
  @Override
  public Optional<String> value() {
    return Optional.ofNullable(value);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_RequestHeader#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_RequestHeader withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTestScript_RequestHeader(newValue, this.extension, this.id, this.field, this.value);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_RequestHeader#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_RequestHeader withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTestScript_RequestHeader(value, this.extension, this.id, this.field, this.value);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_RequestHeader#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_RequestHeader withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTestScript_RequestHeader(this.modifierExtension, newValue, this.id, this.field, this.value);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_RequestHeader#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_RequestHeader withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTestScript_RequestHeader(this.modifierExtension, value, this.id, this.field, this.value);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_RequestHeader#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_RequestHeader withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableTestScript_RequestHeader(this.modifierExtension, this.extension, newValue, this.field, this.value);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_RequestHeader#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_RequestHeader withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableTestScript_RequestHeader(this.modifierExtension, this.extension, value, this.field, this.value);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_RequestHeader#field() field} attribute.
   * @param value The value for field
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_RequestHeader withField(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "field");
    if (Objects.equals(this.field, newValue)) return this;
    return new ImmutableTestScript_RequestHeader(this.modifierExtension, this.extension, this.id, newValue, this.value);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_RequestHeader#field() field} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for field
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_RequestHeader withField(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.field, value)) return this;
    return new ImmutableTestScript_RequestHeader(this.modifierExtension, this.extension, this.id, value, this.value);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_RequestHeader#value() value} attribute.
   * @param value The value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_RequestHeader withValue(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "value");
    if (Objects.equals(this.value, newValue)) return this;
    return new ImmutableTestScript_RequestHeader(this.modifierExtension, this.extension, this.id, this.field, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_RequestHeader#value() value} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_RequestHeader withValue(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.value, value)) return this;
    return new ImmutableTestScript_RequestHeader(this.modifierExtension, this.extension, this.id, this.field, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTestScript_RequestHeader} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTestScript_RequestHeader
        && equalTo((ImmutableTestScript_RequestHeader) another);
  }

  private boolean equalTo(ImmutableTestScript_RequestHeader another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && Objects.equals(field, another.field)
        && Objects.equals(value, another.value);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code extension}, {@code id}, {@code field}, {@code value}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(field);
    h += (h << 5) + Objects.hashCode(value);
    return h;
  }

  /**
   * Prints the immutable value {@code TestScript_RequestHeader} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("TestScript_RequestHeader{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (field != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("field=").append(field);
    }
    if (value != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("value=").append(value);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "TestScript_RequestHeader", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TestScript_RequestHeader {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> field = Optional.empty();
    boolean fieldIsSet;
    @Nullable Optional<String> value = Optional.empty();
    boolean valueIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
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
    @JsonProperty("field")
    public void setField(Optional<String> field) {
      this.field = field;
      this.fieldIsSet = true;
    }
    @JsonProperty("value")
    public void setValue(Optional<String> value) {
      this.value = value;
      this.valueIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> field() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> value() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTestScript_RequestHeader fromJson(Json json) {
    ImmutableTestScript_RequestHeader.Builder builder = ImmutableTestScript_RequestHeader.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.fieldIsSet) {
      builder.field(json.field);
    }
    if (json.valueIsSet) {
      builder.value(json.value);
    }
    return (ImmutableTestScript_RequestHeader) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TestScript_RequestHeader} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TestScript_RequestHeader instance
   */
  public static TestScript_RequestHeader copyOf(TestScript_RequestHeader instance) {
    if (instance instanceof ImmutableTestScript_RequestHeader) {
      return (ImmutableTestScript_RequestHeader) instance;
    }
    return ImmutableTestScript_RequestHeader.builder()
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .id(instance.id())
        .field(instance.field())
        .value(instance.value())
        .build();
  }

  /**
   * Creates a builder for {@link TestScript_RequestHeader TestScript_RequestHeader}.
   * <pre>
   * ImmutableTestScript_RequestHeader.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link TestScript_RequestHeader#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link TestScript_RequestHeader#extension() extension}
   *    .id(String) // optional {@link TestScript_RequestHeader#id() id}
   *    .field(String) // optional {@link TestScript_RequestHeader#field() field}
   *    .value(String) // optional {@link TestScript_RequestHeader#value() value}
   *    .build();
   * </pre>
   * @return A new TestScript_RequestHeader builder
   */
  public static ImmutableTestScript_RequestHeader.Builder builder() {
    return new ImmutableTestScript_RequestHeader.Builder();
  }

  /**
   * Builds instances of type {@link TestScript_RequestHeader TestScript_RequestHeader}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "TestScript_RequestHeader", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_FIELD = 0x8L;
    private static final long OPT_BIT_VALUE = 0x10L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;
    private @Nullable String id;
    private @Nullable String field;
    private @Nullable String value;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link TestScript_RequestHeader#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TestScript_RequestHeader#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TestScript_RequestHeader#extension() extension} to extension.
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
     * Initializes the optional value {@link TestScript_RequestHeader#extension() extension} to extension.
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
     * Initializes the optional value {@link TestScript_RequestHeader#id() id} to id.
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
     * Initializes the optional value {@link TestScript_RequestHeader#id() id} to id.
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
     * Initializes the optional value {@link TestScript_RequestHeader#field() field} to field.
     * @param field The value for field
     * @return {@code this} builder for chained invocation
     */
    public final Builder field(String field) {
      checkNotIsSet(fieldIsSet(), "field");
      this.field = Objects.requireNonNull(field, "field");
      optBits |= OPT_BIT_FIELD;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_RequestHeader#field() field} to field.
     * @param field The value for field
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("field")
    public final Builder field(Optional<String> field) {
      checkNotIsSet(fieldIsSet(), "field");
      this.field = field.orElse(null);
      optBits |= OPT_BIT_FIELD;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_RequestHeader#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for chained invocation
     */
    public final Builder value(String value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = Objects.requireNonNull(value, "value");
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_RequestHeader#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("value")
    public final Builder value(Optional<String> value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = value.orElse(null);
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Builds a new {@link TestScript_RequestHeader TestScript_RequestHeader}.
     * @return An immutable instance of TestScript_RequestHeader
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public TestScript_RequestHeader build() {
      return new ImmutableTestScript_RequestHeader(modifierExtension, extension, id, field, value);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean fieldIsSet() {
      return (optBits & OPT_BIT_FIELD) != 0;
    }

    private boolean valueIsSet() {
      return (optBits & OPT_BIT_VALUE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of TestScript_RequestHeader is strict, attribute is already set: ".concat(name));
    }
  }
}
