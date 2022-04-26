package com.fhir.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link UsageContext}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableUsageContext.builder()}.
 */
@Generated(from = "UsageContext", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableUsageContext implements UsageContext {
  private final @Nullable List<Extension> extension;
  private final @Nullable Quantity valueQuantity;
  private final @Nullable Range valueRange;
  private final @Nullable String id;
  private final Coding code;
  private final @Nullable Reference valueReference;
  private final @Nullable CodeableConcept valueCodeableConcept;

  private ImmutableUsageContext(
      @Nullable List<Extension> extension,
      @Nullable Quantity valueQuantity,
      @Nullable Range valueRange,
      @Nullable String id,
      Coding code,
      @Nullable Reference valueReference,
      @Nullable CodeableConcept valueCodeableConcept) {
    this.extension = extension;
    this.valueQuantity = valueQuantity;
    this.valueRange = valueRange;
    this.id = id;
    this.code = code;
    this.valueReference = valueReference;
    this.valueCodeableConcept = valueCodeableConcept;
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
   * @return The value of the {@code valueQuantity} attribute
   */
  @JsonProperty("valueQuantity")
  @Override
  public Optional<Quantity> valueQuantity() {
    return Optional.ofNullable(valueQuantity);
  }

  /**
   * @return The value of the {@code valueRange} attribute
   */
  @JsonProperty("valueRange")
  @Override
  public Optional<Range> valueRange() {
    return Optional.ofNullable(valueRange);
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
  public Coding code() {
    return code;
  }

  /**
   * @return The value of the {@code valueReference} attribute
   */
  @JsonProperty("valueReference")
  @Override
  public Optional<Reference> valueReference() {
    return Optional.ofNullable(valueReference);
  }

  /**
   * @return The value of the {@code valueCodeableConcept} attribute
   */
  @JsonProperty("valueCodeableConcept")
  @Override
  public Optional<CodeableConcept> valueCodeableConcept() {
    return Optional.ofNullable(valueCodeableConcept);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UsageContext#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUsageContext withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableUsageContext(
        newValue,
        this.valueQuantity,
        this.valueRange,
        this.id,
        this.code,
        this.valueReference,
        this.valueCodeableConcept);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UsageContext#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableUsageContext withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableUsageContext(
        value,
        this.valueQuantity,
        this.valueRange,
        this.id,
        this.code,
        this.valueReference,
        this.valueCodeableConcept);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UsageContext#valueQuantity() valueQuantity} attribute.
   * @param value The value for valueQuantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUsageContext withValueQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "valueQuantity");
    if (this.valueQuantity == newValue) return this;
    return new ImmutableUsageContext(
        this.extension,
        newValue,
        this.valueRange,
        this.id,
        this.code,
        this.valueReference,
        this.valueCodeableConcept);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UsageContext#valueQuantity() valueQuantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueQuantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableUsageContext withValueQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.valueQuantity == value) return this;
    return new ImmutableUsageContext(
        this.extension,
        value,
        this.valueRange,
        this.id,
        this.code,
        this.valueReference,
        this.valueCodeableConcept);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UsageContext#valueRange() valueRange} attribute.
   * @param value The value for valueRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUsageContext withValueRange(Range value) {
    @Nullable Range newValue = Objects.requireNonNull(value, "valueRange");
    if (this.valueRange == newValue) return this;
    return new ImmutableUsageContext(
        this.extension,
        this.valueQuantity,
        newValue,
        this.id,
        this.code,
        this.valueReference,
        this.valueCodeableConcept);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UsageContext#valueRange() valueRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableUsageContext withValueRange(Optional<? extends Range> optional) {
    @Nullable Range value = optional.orElse(null);
    if (this.valueRange == value) return this;
    return new ImmutableUsageContext(
        this.extension,
        this.valueQuantity,
        value,
        this.id,
        this.code,
        this.valueReference,
        this.valueCodeableConcept);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UsageContext#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUsageContext withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableUsageContext(
        this.extension,
        this.valueQuantity,
        this.valueRange,
        newValue,
        this.code,
        this.valueReference,
        this.valueCodeableConcept);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UsageContext#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUsageContext withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableUsageContext(
        this.extension,
        this.valueQuantity,
        this.valueRange,
        value,
        this.code,
        this.valueReference,
        this.valueCodeableConcept);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link UsageContext#code() code} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for code
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUsageContext withCode(Coding value) {
    if (this.code == value) return this;
    Coding newValue = Objects.requireNonNull(value, "code");
    return new ImmutableUsageContext(
        this.extension,
        this.valueQuantity,
        this.valueRange,
        this.id,
        newValue,
        this.valueReference,
        this.valueCodeableConcept);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UsageContext#valueReference() valueReference} attribute.
   * @param value The value for valueReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUsageContext withValueReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "valueReference");
    if (this.valueReference == newValue) return this;
    return new ImmutableUsageContext(
        this.extension,
        this.valueQuantity,
        this.valueRange,
        this.id,
        this.code,
        newValue,
        this.valueCodeableConcept);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UsageContext#valueReference() valueReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableUsageContext withValueReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.valueReference == value) return this;
    return new ImmutableUsageContext(
        this.extension,
        this.valueQuantity,
        this.valueRange,
        this.id,
        this.code,
        value,
        this.valueCodeableConcept);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UsageContext#valueCodeableConcept() valueCodeableConcept} attribute.
   * @param value The value for valueCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUsageContext withValueCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "valueCodeableConcept");
    if (this.valueCodeableConcept == newValue) return this;
    return new ImmutableUsageContext(
        this.extension,
        this.valueQuantity,
        this.valueRange,
        this.id,
        this.code,
        this.valueReference,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UsageContext#valueCodeableConcept() valueCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableUsageContext withValueCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.valueCodeableConcept == value) return this;
    return new ImmutableUsageContext(
        this.extension,
        this.valueQuantity,
        this.valueRange,
        this.id,
        this.code,
        this.valueReference,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableUsageContext} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableUsageContext
        && equalTo((ImmutableUsageContext) another);
  }

  private boolean equalTo(ImmutableUsageContext another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(valueQuantity, another.valueQuantity)
        && Objects.equals(valueRange, another.valueRange)
        && Objects.equals(id, another.id)
        && code.equals(another.code)
        && Objects.equals(valueReference, another.valueReference)
        && Objects.equals(valueCodeableConcept, another.valueCodeableConcept);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code valueQuantity}, {@code valueRange}, {@code id}, {@code code}, {@code valueReference}, {@code valueCodeableConcept}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(valueQuantity);
    h += (h << 5) + Objects.hashCode(valueRange);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + code.hashCode();
    h += (h << 5) + Objects.hashCode(valueReference);
    h += (h << 5) + Objects.hashCode(valueCodeableConcept);
    return h;
  }

  /**
   * Prints the immutable value {@code UsageContext} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("UsageContext{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (valueQuantity != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("valueQuantity=").append(valueQuantity);
    }
    if (valueRange != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("valueRange=").append(valueRange);
    }
    if (id != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (builder.length() > 13) builder.append(", ");
    builder.append("code=").append(code);
    if (valueReference != null) {
      builder.append(", ");
      builder.append("valueReference=").append(valueReference);
    }
    if (valueCodeableConcept != null) {
      builder.append(", ");
      builder.append("valueCodeableConcept=").append(valueCodeableConcept);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "UsageContext", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements UsageContext {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Quantity> valueQuantity = Optional.empty();
    boolean valueQuantityIsSet;
    @Nullable Optional<Range> valueRange = Optional.empty();
    boolean valueRangeIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Coding code;
    @Nullable Optional<Reference> valueReference = Optional.empty();
    boolean valueReferenceIsSet;
    @Nullable Optional<CodeableConcept> valueCodeableConcept = Optional.empty();
    boolean valueCodeableConceptIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("valueQuantity")
    public void setValueQuantity(Optional<Quantity> valueQuantity) {
      this.valueQuantity = valueQuantity;
      this.valueQuantityIsSet = true;
    }
    @JsonProperty("valueRange")
    public void setValueRange(Optional<Range> valueRange) {
      this.valueRange = valueRange;
      this.valueRangeIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Coding code) {
      this.code = code;
    }
    @JsonProperty("valueReference")
    public void setValueReference(Optional<Reference> valueReference) {
      this.valueReference = valueReference;
      this.valueReferenceIsSet = true;
    }
    @JsonProperty("valueCodeableConcept")
    public void setValueCodeableConcept(Optional<CodeableConcept> valueCodeableConcept) {
      this.valueCodeableConcept = valueCodeableConcept;
      this.valueCodeableConceptIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> valueQuantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Range> valueRange() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Coding code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> valueReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> valueCodeableConcept() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableUsageContext fromJson(Json json) {
    ImmutableUsageContext.Builder builder = ((ImmutableUsageContext.Builder) ImmutableUsageContext.builder());
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.valueQuantityIsSet) {
      builder.valueQuantity(json.valueQuantity);
    }
    if (json.valueRangeIsSet) {
      builder.valueRange(json.valueRange);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.code != null) {
      builder.code(json.code);
    }
    if (json.valueReferenceIsSet) {
      builder.valueReference(json.valueReference);
    }
    if (json.valueCodeableConceptIsSet) {
      builder.valueCodeableConcept(json.valueCodeableConcept);
    }
    return (ImmutableUsageContext) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link UsageContext} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable UsageContext instance
   */
  public static UsageContext copyOf(UsageContext instance) {
    if (instance instanceof ImmutableUsageContext) {
      return (ImmutableUsageContext) instance;
    }
    return ((ImmutableUsageContext.Builder) ImmutableUsageContext.builder())
        .extension(instance.extension())
        .valueQuantity(instance.valueQuantity())
        .valueRange(instance.valueRange())
        .id(instance.id())
        .code(instance.code())
        .valueReference(instance.valueReference())
        .valueCodeableConcept(instance.valueCodeableConcept())
        .build();
  }

  /**
   * Creates a builder for {@link UsageContext UsageContext}.
   * <pre>
   * ImmutableUsageContext.builder()
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link UsageContext#extension() extension}
   *    .valueQuantity(com.fhir.types.fhir.Quantity) // optional {@link UsageContext#valueQuantity() valueQuantity}
   *    .valueRange(com.fhir.types.fhir.Range) // optional {@link UsageContext#valueRange() valueRange}
   *    .id(String) // optional {@link UsageContext#id() id}
   *    .code(com.fhir.types.fhir.Coding) // required {@link UsageContext#code() code}
   *    .valueReference(com.fhir.types.fhir.Reference) // optional {@link UsageContext#valueReference() valueReference}
   *    .valueCodeableConcept(com.fhir.types.fhir.CodeableConcept) // optional {@link UsageContext#valueCodeableConcept() valueCodeableConcept}
   *    .build();
   * </pre>
   * @return A new UsageContext builder
   */
  public static CodeBuildStage builder() {
    return new ImmutableUsageContext.Builder();
  }

  /**
   * Builds instances of type {@link UsageContext UsageContext}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "UsageContext", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements CodeBuildStage, BuildFinal {
    private static final long INIT_BIT_CODE = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_VALUE_QUANTITY = 0x2L;
    private static final long OPT_BIT_VALUE_RANGE = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_VALUE_REFERENCE = 0x10L;
    private static final long OPT_BIT_VALUE_CODEABLE_CONCEPT = 0x20L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable Quantity valueQuantity;
    private @Nullable Range valueRange;
    private @Nullable String id;
    private @Nullable Coding code;
    private @Nullable Reference valueReference;
    private @Nullable CodeableConcept valueCodeableConcept;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link UsageContext#extension() extension} to extension.
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
     * Initializes the optional value {@link UsageContext#extension() extension} to extension.
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
     * Initializes the optional value {@link UsageContext#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueQuantity(Quantity valueQuantity) {
      checkNotIsSet(valueQuantityIsSet(), "valueQuantity");
      this.valueQuantity = Objects.requireNonNull(valueQuantity, "valueQuantity");
      optBits |= OPT_BIT_VALUE_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link UsageContext#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueQuantity")
    public final Builder valueQuantity(Optional<? extends Quantity> valueQuantity) {
      checkNotIsSet(valueQuantityIsSet(), "valueQuantity");
      this.valueQuantity = valueQuantity.orElse(null);
      optBits |= OPT_BIT_VALUE_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link UsageContext#valueRange() valueRange} to valueRange.
     * @param valueRange The value for valueRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueRange(Range valueRange) {
      checkNotIsSet(valueRangeIsSet(), "valueRange");
      this.valueRange = Objects.requireNonNull(valueRange, "valueRange");
      optBits |= OPT_BIT_VALUE_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link UsageContext#valueRange() valueRange} to valueRange.
     * @param valueRange The value for valueRange
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueRange")
    public final Builder valueRange(Optional<? extends Range> valueRange) {
      checkNotIsSet(valueRangeIsSet(), "valueRange");
      this.valueRange = valueRange.orElse(null);
      optBits |= OPT_BIT_VALUE_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link UsageContext#id() id} to id.
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
     * Initializes the optional value {@link UsageContext#id() id} to id.
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
     * Initializes the value for the {@link UsageContext#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Coding code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      initBits &= ~INIT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link UsageContext#valueReference() valueReference} to valueReference.
     * @param valueReference The value for valueReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueReference(Reference valueReference) {
      checkNotIsSet(valueReferenceIsSet(), "valueReference");
      this.valueReference = Objects.requireNonNull(valueReference, "valueReference");
      optBits |= OPT_BIT_VALUE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link UsageContext#valueReference() valueReference} to valueReference.
     * @param valueReference The value for valueReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueReference")
    public final Builder valueReference(Optional<? extends Reference> valueReference) {
      checkNotIsSet(valueReferenceIsSet(), "valueReference");
      this.valueReference = valueReference.orElse(null);
      optBits |= OPT_BIT_VALUE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link UsageContext#valueCodeableConcept() valueCodeableConcept} to valueCodeableConcept.
     * @param valueCodeableConcept The value for valueCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueCodeableConcept(CodeableConcept valueCodeableConcept) {
      checkNotIsSet(valueCodeableConceptIsSet(), "valueCodeableConcept");
      this.valueCodeableConcept = Objects.requireNonNull(valueCodeableConcept, "valueCodeableConcept");
      optBits |= OPT_BIT_VALUE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link UsageContext#valueCodeableConcept() valueCodeableConcept} to valueCodeableConcept.
     * @param valueCodeableConcept The value for valueCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueCodeableConcept")
    public final Builder valueCodeableConcept(Optional<? extends CodeableConcept> valueCodeableConcept) {
      checkNotIsSet(valueCodeableConceptIsSet(), "valueCodeableConcept");
      this.valueCodeableConcept = valueCodeableConcept.orElse(null);
      optBits |= OPT_BIT_VALUE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Builds a new {@link UsageContext UsageContext}.
     * @return An immutable instance of UsageContext
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public UsageContext build() {
      checkRequiredAttributes();
      return new ImmutableUsageContext(extension, valueQuantity, valueRange, id, code, valueReference, valueCodeableConcept);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean valueQuantityIsSet() {
      return (optBits & OPT_BIT_VALUE_QUANTITY) != 0;
    }

    private boolean valueRangeIsSet() {
      return (optBits & OPT_BIT_VALUE_RANGE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean valueReferenceIsSet() {
      return (optBits & OPT_BIT_VALUE_REFERENCE) != 0;
    }

    private boolean valueCodeableConceptIsSet() {
      return (optBits & OPT_BIT_VALUE_CODEABLE_CONCEPT) != 0;
    }

    private boolean codeIsSet() {
      return (initBits & INIT_BIT_CODE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of UsageContext is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!codeIsSet()) attributes.add("code");
      return "Cannot build UsageContext, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "UsageContext", generator = "Immutables")
  public interface CodeBuildStage {
    /**
     * Initializes the value for the {@link UsageContext#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(Coding code);
  }

  @Generated(from = "UsageContext", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link UsageContext#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link UsageContext#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link UsageContext#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueQuantity(Quantity valueQuantity);

    /**
     * Initializes the optional value {@link UsageContext#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueQuantity(Optional<? extends Quantity> valueQuantity);

    /**
     * Initializes the optional value {@link UsageContext#valueRange() valueRange} to valueRange.
     * @param valueRange The value for valueRange
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueRange(Range valueRange);

    /**
     * Initializes the optional value {@link UsageContext#valueRange() valueRange} to valueRange.
     * @param valueRange The value for valueRange
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueRange(Optional<? extends Range> valueRange);

    /**
     * Initializes the optional value {@link UsageContext#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link UsageContext#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link UsageContext#valueReference() valueReference} to valueReference.
     * @param valueReference The value for valueReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueReference(Reference valueReference);

    /**
     * Initializes the optional value {@link UsageContext#valueReference() valueReference} to valueReference.
     * @param valueReference The value for valueReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueReference(Optional<? extends Reference> valueReference);

    /**
     * Initializes the optional value {@link UsageContext#valueCodeableConcept() valueCodeableConcept} to valueCodeableConcept.
     * @param valueCodeableConcept The value for valueCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueCodeableConcept(CodeableConcept valueCodeableConcept);

    /**
     * Initializes the optional value {@link UsageContext#valueCodeableConcept() valueCodeableConcept} to valueCodeableConcept.
     * @param valueCodeableConcept The value for valueCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueCodeableConcept(Optional<? extends CodeableConcept> valueCodeableConcept);

    /**
     * Builds a new {@link UsageContext UsageContext}.
     * @return An immutable instance of UsageContext
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    UsageContext build();
  }
}
