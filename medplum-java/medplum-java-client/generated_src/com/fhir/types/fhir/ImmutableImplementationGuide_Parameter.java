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
 * Immutable implementation of {@link ImplementationGuide_Parameter}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableImplementationGuide_Parameter.builder()}.
 */
@Generated(from = "ImplementationGuide_Parameter", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableImplementationGuide_Parameter
    implements ImplementationGuide_Parameter {
  private final @Nullable String id;
  private final @Nullable String value;
  private final @Nullable Implementationguide_ParameterCode code;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;

  private ImmutableImplementationGuide_Parameter(
      @Nullable String id,
      @Nullable String value,
      @Nullable Implementationguide_ParameterCode code,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension) {
    this.id = id;
    this.value = value;
    this.code = code;
    this.modifierExtension = modifierExtension;
    this.extension = extension;
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
   * @return The value of the {@code value} attribute
   */
  @JsonProperty("value")
  @Override
  public Optional<String> value() {
    return Optional.ofNullable(value);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<Implementationguide_ParameterCode> code() {
    return Optional.ofNullable(code);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Parameter#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Parameter withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableImplementationGuide_Parameter(newValue, this.value, this.code, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Parameter#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Parameter withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableImplementationGuide_Parameter(value, this.value, this.code, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Parameter#value() value} attribute.
   * @param value The value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Parameter withValue(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "value");
    if (Objects.equals(this.value, newValue)) return this;
    return new ImmutableImplementationGuide_Parameter(this.id, newValue, this.code, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Parameter#value() value} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Parameter withValue(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.value, value)) return this;
    return new ImmutableImplementationGuide_Parameter(this.id, value, this.code, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Parameter#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Parameter withCode(Implementationguide_ParameterCode value) {
    @Nullable Implementationguide_ParameterCode newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableImplementationGuide_Parameter(this.id, this.value, newValue, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Parameter#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Parameter withCode(Optional<? extends Implementationguide_ParameterCode> optional) {
    @Nullable Implementationguide_ParameterCode value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableImplementationGuide_Parameter(this.id, this.value, value, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Parameter#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Parameter withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableImplementationGuide_Parameter(this.id, this.value, this.code, newValue, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Parameter#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Parameter withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableImplementationGuide_Parameter(this.id, this.value, this.code, value, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Parameter#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Parameter withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableImplementationGuide_Parameter(this.id, this.value, this.code, this.modifierExtension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Parameter#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Parameter withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableImplementationGuide_Parameter(this.id, this.value, this.code, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableImplementationGuide_Parameter} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableImplementationGuide_Parameter
        && equalTo((ImmutableImplementationGuide_Parameter) another);
  }

  private boolean equalTo(ImmutableImplementationGuide_Parameter another) {
    return Objects.equals(id, another.id)
        && Objects.equals(value, another.value)
        && Objects.equals(code, another.code)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code value}, {@code code}, {@code modifierExtension}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(value);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code ImplementationGuide_Parameter} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ImplementationGuide_Parameter{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (value != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("value=").append(value);
    }
    if (code != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (modifierExtension != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ImplementationGuide_Parameter", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ImplementationGuide_Parameter {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> value = Optional.empty();
    boolean valueIsSet;
    @Nullable Optional<Implementationguide_ParameterCode> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("value")
    public void setValue(Optional<String> value) {
      this.value = value;
      this.valueIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<Implementationguide_ParameterCode> code) {
      this.code = code;
      this.codeIsSet = true;
    }
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
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> value() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Implementationguide_ParameterCode> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableImplementationGuide_Parameter fromJson(Json json) {
    ImmutableImplementationGuide_Parameter.Builder builder = ImmutableImplementationGuide_Parameter.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.valueIsSet) {
      builder.value(json.value);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableImplementationGuide_Parameter) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ImplementationGuide_Parameter} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ImplementationGuide_Parameter instance
   */
  public static ImplementationGuide_Parameter copyOf(ImplementationGuide_Parameter instance) {
    if (instance instanceof ImmutableImplementationGuide_Parameter) {
      return (ImmutableImplementationGuide_Parameter) instance;
    }
    return ImmutableImplementationGuide_Parameter.builder()
        .id(instance.id())
        .value(instance.value())
        .code(instance.code())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link ImplementationGuide_Parameter ImplementationGuide_Parameter}.
   * <pre>
   * ImmutableImplementationGuide_Parameter.builder()
   *    .id(String) // optional {@link ImplementationGuide_Parameter#id() id}
   *    .value(String) // optional {@link ImplementationGuide_Parameter#value() value}
   *    .code(Implementationguide_ParameterCode) // optional {@link ImplementationGuide_Parameter#code() code}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ImplementationGuide_Parameter#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ImplementationGuide_Parameter#extension() extension}
   *    .build();
   * </pre>
   * @return A new ImplementationGuide_Parameter builder
   */
  public static ImmutableImplementationGuide_Parameter.Builder builder() {
    return new ImmutableImplementationGuide_Parameter.Builder();
  }

  /**
   * Builds instances of type {@link ImplementationGuide_Parameter ImplementationGuide_Parameter}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ImplementationGuide_Parameter", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_VALUE = 0x2L;
    private static final long OPT_BIT_CODE = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private long optBits;

    private @Nullable String id;
    private @Nullable String value;
    private @Nullable Implementationguide_ParameterCode code;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Parameter#id() id} to id.
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
     * Initializes the optional value {@link ImplementationGuide_Parameter#id() id} to id.
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
     * Initializes the optional value {@link ImplementationGuide_Parameter#value() value} to value.
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
     * Initializes the optional value {@link ImplementationGuide_Parameter#value() value} to value.
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
     * Initializes the optional value {@link ImplementationGuide_Parameter#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(Implementationguide_ParameterCode code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Parameter#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends Implementationguide_ParameterCode> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Parameter#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImplementationGuide_Parameter#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImplementationGuide_Parameter#extension() extension} to extension.
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
     * Initializes the optional value {@link ImplementationGuide_Parameter#extension() extension} to extension.
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
     * Builds a new {@link ImplementationGuide_Parameter ImplementationGuide_Parameter}.
     * @return An immutable instance of ImplementationGuide_Parameter
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImplementationGuide_Parameter build() {
      return new ImmutableImplementationGuide_Parameter(id, value, code, modifierExtension, extension);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean valueIsSet() {
      return (optBits & OPT_BIT_VALUE) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ImplementationGuide_Parameter is strict, attribute is already set: ".concat(name));
    }
  }
}
