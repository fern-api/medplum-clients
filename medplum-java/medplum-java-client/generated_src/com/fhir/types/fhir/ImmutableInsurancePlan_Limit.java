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
 * Immutable implementation of {@link InsurancePlan_Limit}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableInsurancePlan_Limit.builder()}.
 */
@Generated(from = "InsurancePlan_Limit", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableInsurancePlan_Limit implements InsurancePlan_Limit {
  private final @Nullable List<Extension> extension;
  private final @Nullable Quantity value;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final @Nullable CodeableConcept code;

  private ImmutableInsurancePlan_Limit(
      @Nullable List<Extension> extension,
      @Nullable Quantity value,
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      @Nullable CodeableConcept code) {
    this.extension = extension;
    this.value = value;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.code = code;
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
   * @return The value of the {@code value} attribute
   */
  @JsonProperty("value")
  @Override
  public Optional<Quantity> value() {
    return Optional.ofNullable(value);
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
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<CodeableConcept> code() {
    return Optional.ofNullable(code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_Limit#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Limit withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableInsurancePlan_Limit(newValue, this.value, this.modifierExtension, this.id, this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_Limit#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_Limit withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableInsurancePlan_Limit(value, this.value, this.modifierExtension, this.id, this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_Limit#value() value} attribute.
   * @param value The value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Limit withValue(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "value");
    if (this.value == newValue) return this;
    return new ImmutableInsurancePlan_Limit(this.extension, newValue, this.modifierExtension, this.id, this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_Limit#value() value} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for value
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_Limit withValue(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.value == value) return this;
    return new ImmutableInsurancePlan_Limit(this.extension, value, this.modifierExtension, this.id, this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_Limit#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Limit withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableInsurancePlan_Limit(this.extension, this.value, newValue, this.id, this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_Limit#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_Limit withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableInsurancePlan_Limit(this.extension, this.value, value, this.id, this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_Limit#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Limit withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableInsurancePlan_Limit(this.extension, this.value, this.modifierExtension, newValue, this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_Limit#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Limit withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableInsurancePlan_Limit(this.extension, this.value, this.modifierExtension, value, this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_Limit#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Limit withCode(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableInsurancePlan_Limit(this.extension, this.value, this.modifierExtension, this.id, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_Limit#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_Limit withCode(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableInsurancePlan_Limit(this.extension, this.value, this.modifierExtension, this.id, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableInsurancePlan_Limit} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableInsurancePlan_Limit
        && equalTo((ImmutableInsurancePlan_Limit) another);
  }

  private boolean equalTo(ImmutableInsurancePlan_Limit another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(value, another.value)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(code, another.code);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code value}, {@code modifierExtension}, {@code id}, {@code code}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(value);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(code);
    return h;
  }

  /**
   * Prints the immutable value {@code InsurancePlan_Limit} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("InsurancePlan_Limit{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (value != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("value=").append(value);
    }
    if (modifierExtension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (code != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("code=").append(code);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "InsurancePlan_Limit", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements InsurancePlan_Limit {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Quantity> value = Optional.empty();
    boolean valueIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> code = Optional.empty();
    boolean codeIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("value")
    public void setValue(Optional<Quantity> value) {
      this.value = value;
      this.valueIsSet = true;
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
    @JsonProperty("code")
    public void setCode(Optional<CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> value() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> code() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableInsurancePlan_Limit fromJson(Json json) {
    ImmutableInsurancePlan_Limit.Builder builder = ImmutableInsurancePlan_Limit.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.valueIsSet) {
      builder.value(json.value);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    return (ImmutableInsurancePlan_Limit) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link InsurancePlan_Limit} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable InsurancePlan_Limit instance
   */
  public static InsurancePlan_Limit copyOf(InsurancePlan_Limit instance) {
    if (instance instanceof ImmutableInsurancePlan_Limit) {
      return (ImmutableInsurancePlan_Limit) instance;
    }
    return ImmutableInsurancePlan_Limit.builder()
        .extension(instance.extension())
        .value(instance.value())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .code(instance.code())
        .build();
  }

  /**
   * Creates a builder for {@link InsurancePlan_Limit InsurancePlan_Limit}.
   * <pre>
   * ImmutableInsurancePlan_Limit.builder()
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link InsurancePlan_Limit#extension() extension}
   *    .value(com.fhir.types.fhir.Quantity) // optional {@link InsurancePlan_Limit#value() value}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link InsurancePlan_Limit#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link InsurancePlan_Limit#id() id}
   *    .code(com.fhir.types.fhir.CodeableConcept) // optional {@link InsurancePlan_Limit#code() code}
   *    .build();
   * </pre>
   * @return A new InsurancePlan_Limit builder
   */
  public static ImmutableInsurancePlan_Limit.Builder builder() {
    return new ImmutableInsurancePlan_Limit.Builder();
  }

  /**
   * Builds instances of type {@link InsurancePlan_Limit InsurancePlan_Limit}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "InsurancePlan_Limit", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_VALUE = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_CODE = 0x10L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable Quantity value;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable CodeableConcept code;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link InsurancePlan_Limit#extension() extension} to extension.
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
     * Initializes the optional value {@link InsurancePlan_Limit#extension() extension} to extension.
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
     * Initializes the optional value {@link InsurancePlan_Limit#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for chained invocation
     */
    public final Builder value(Quantity value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = Objects.requireNonNull(value, "value");
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_Limit#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("value")
    public final Builder value(Optional<? extends Quantity> value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = value.orElse(null);
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_Limit#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link InsurancePlan_Limit#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link InsurancePlan_Limit#id() id} to id.
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
     * Initializes the optional value {@link InsurancePlan_Limit#id() id} to id.
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
     * Initializes the optional value {@link InsurancePlan_Limit#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_Limit#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends CodeableConcept> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Builds a new {@link InsurancePlan_Limit InsurancePlan_Limit}.
     * @return An immutable instance of InsurancePlan_Limit
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public InsurancePlan_Limit build() {
      return new ImmutableInsurancePlan_Limit(extension, value, modifierExtension, id, code);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean valueIsSet() {
      return (optBits & OPT_BIT_VALUE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of InsurancePlan_Limit is strict, attribute is already set: ".concat(name));
    }
  }
}
