package com.fhir;

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
 * Immutable implementation of {@link Measure_SupplementalData}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMeasure_SupplementalData.builder()}.
 */
@Generated(from = "Measure_SupplementalData", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMeasure_SupplementalData implements Measure_SupplementalData {
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final @Nullable CodeableConcept code;
  private final @Nullable List<CodeableConcept> usage;
  private final @Nullable String description;
  private final Expression criteria;

  private ImmutableMeasure_SupplementalData(
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      @Nullable CodeableConcept code,
      @Nullable List<CodeableConcept> usage,
      @Nullable String description,
      Expression criteria) {
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.code = code;
    this.usage = usage;
    this.description = description;
    this.criteria = criteria;
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
   * @return The value of the {@code usage} attribute
   */
  @JsonProperty("usage")
  @Override
  public Optional<List<CodeableConcept>> usage() {
    return Optional.ofNullable(usage);
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
   * @return The value of the {@code criteria} attribute
   */
  @JsonProperty("criteria")
  @Override
  public Expression criteria() {
    return criteria;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure_SupplementalData#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure_SupplementalData withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMeasure_SupplementalData(
        newValue,
        this.modifierExtension,
        this.id,
        this.code,
        this.usage,
        this.description,
        this.criteria);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure_SupplementalData#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure_SupplementalData withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMeasure_SupplementalData(value, this.modifierExtension, this.id, this.code, this.usage, this.description, this.criteria);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure_SupplementalData#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure_SupplementalData withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMeasure_SupplementalData(this.extension, newValue, this.id, this.code, this.usage, this.description, this.criteria);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure_SupplementalData#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure_SupplementalData withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMeasure_SupplementalData(this.extension, value, this.id, this.code, this.usage, this.description, this.criteria);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure_SupplementalData#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure_SupplementalData withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMeasure_SupplementalData(
        this.extension,
        this.modifierExtension,
        newValue,
        this.code,
        this.usage,
        this.description,
        this.criteria);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure_SupplementalData#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure_SupplementalData withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMeasure_SupplementalData(
        this.extension,
        this.modifierExtension,
        value,
        this.code,
        this.usage,
        this.description,
        this.criteria);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure_SupplementalData#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure_SupplementalData withCode(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableMeasure_SupplementalData(
        this.extension,
        this.modifierExtension,
        this.id,
        newValue,
        this.usage,
        this.description,
        this.criteria);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure_SupplementalData#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure_SupplementalData withCode(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableMeasure_SupplementalData(
        this.extension,
        this.modifierExtension,
        this.id,
        value,
        this.usage,
        this.description,
        this.criteria);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure_SupplementalData#usage() usage} attribute.
   * @param value The value for usage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure_SupplementalData withUsage(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "usage");
    if (this.usage == newValue) return this;
    return new ImmutableMeasure_SupplementalData(
        this.extension,
        this.modifierExtension,
        this.id,
        this.code,
        newValue,
        this.description,
        this.criteria);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure_SupplementalData#usage() usage} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for usage
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure_SupplementalData withUsage(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.usage == value) return this;
    return new ImmutableMeasure_SupplementalData(
        this.extension,
        this.modifierExtension,
        this.id,
        this.code,
        value,
        this.description,
        this.criteria);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure_SupplementalData#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure_SupplementalData withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableMeasure_SupplementalData(this.extension, this.modifierExtension, this.id, this.code, this.usage, newValue, this.criteria);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure_SupplementalData#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure_SupplementalData withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableMeasure_SupplementalData(this.extension, this.modifierExtension, this.id, this.code, this.usage, value, this.criteria);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Measure_SupplementalData#criteria() criteria} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for criteria
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMeasure_SupplementalData withCriteria(Expression value) {
    if (this.criteria == value) return this;
    Expression newValue = Objects.requireNonNull(value, "criteria");
    return new ImmutableMeasure_SupplementalData(
        this.extension,
        this.modifierExtension,
        this.id,
        this.code,
        this.usage,
        this.description,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMeasure_SupplementalData} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMeasure_SupplementalData
        && equalTo((ImmutableMeasure_SupplementalData) another);
  }

  private boolean equalTo(ImmutableMeasure_SupplementalData another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(code, another.code)
        && Objects.equals(usage, another.usage)
        && Objects.equals(description, another.description)
        && criteria.equals(another.criteria);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code modifierExtension}, {@code id}, {@code code}, {@code usage}, {@code description}, {@code criteria}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(usage);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + criteria.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Measure_SupplementalData} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Measure_SupplementalData{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (code != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (usage != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("usage=").append(usage);
    }
    if (description != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (builder.length() > 25) builder.append(", ");
    builder.append("criteria=").append(criteria);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Measure_SupplementalData", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Measure_SupplementalData {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<List<CodeableConcept>> usage = Optional.empty();
    boolean usageIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Expression criteria;
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
    @JsonProperty("usage")
    public void setUsage(Optional<List<CodeableConcept>> usage) {
      this.usage = usage;
      this.usageIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("criteria")
    public void setCriteria(Expression criteria) {
      this.criteria = criteria;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> usage() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Expression criteria() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMeasure_SupplementalData fromJson(Json json) {
    ImmutableMeasure_SupplementalData.Builder builder = ((ImmutableMeasure_SupplementalData.Builder) ImmutableMeasure_SupplementalData.builder());
    if (json.extensionIsSet) {
      builder.extension(json.extension);
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
    if (json.usageIsSet) {
      builder.usage(json.usage);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.criteria != null) {
      builder.criteria(json.criteria);
    }
    return (ImmutableMeasure_SupplementalData) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Measure_SupplementalData} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Measure_SupplementalData instance
   */
  public static Measure_SupplementalData copyOf(Measure_SupplementalData instance) {
    if (instance instanceof ImmutableMeasure_SupplementalData) {
      return (ImmutableMeasure_SupplementalData) instance;
    }
    return ((ImmutableMeasure_SupplementalData.Builder) ImmutableMeasure_SupplementalData.builder())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .code(instance.code())
        .usage(instance.usage())
        .description(instance.description())
        .criteria(instance.criteria())
        .build();
  }

  /**
   * Creates a builder for {@link Measure_SupplementalData Measure_SupplementalData}.
   * <pre>
   * ImmutableMeasure_SupplementalData.builder()
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Measure_SupplementalData#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Measure_SupplementalData#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link Measure_SupplementalData#id() id}
   *    .code(com.fhir.CodeableConcept) // optional {@link Measure_SupplementalData#code() code}
   *    .usage(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Measure_SupplementalData#usage() usage}
   *    .description(String) // optional {@link Measure_SupplementalData#description() description}
   *    .criteria(com.fhir.Expression) // required {@link Measure_SupplementalData#criteria() criteria}
   *    .build();
   * </pre>
   * @return A new Measure_SupplementalData builder
   */
  public static CriteriaBuildStage builder() {
    return new ImmutableMeasure_SupplementalData.Builder();
  }

  /**
   * Builds instances of type {@link Measure_SupplementalData Measure_SupplementalData}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Measure_SupplementalData", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements CriteriaBuildStage, BuildFinal {
    private static final long INIT_BIT_CRITERIA = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_CODE = 0x8L;
    private static final long OPT_BIT_USAGE = 0x10L;
    private static final long OPT_BIT_DESCRIPTION = 0x20L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable CodeableConcept code;
    private @Nullable List<CodeableConcept> usage;
    private @Nullable String description;
    private @Nullable Expression criteria;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Measure_SupplementalData#extension() extension} to extension.
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
     * Initializes the optional value {@link Measure_SupplementalData#extension() extension} to extension.
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
     * Initializes the optional value {@link Measure_SupplementalData#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Measure_SupplementalData#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Measure_SupplementalData#id() id} to id.
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
     * Initializes the optional value {@link Measure_SupplementalData#id() id} to id.
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
     * Initializes the optional value {@link Measure_SupplementalData#code() code} to code.
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
     * Initializes the optional value {@link Measure_SupplementalData#code() code} to code.
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
     * Initializes the optional value {@link Measure_SupplementalData#usage() usage} to usage.
     * @param usage The value for usage
     * @return {@code this} builder for chained invocation
     */
    public final Builder usage(List<CodeableConcept> usage) {
      checkNotIsSet(usageIsSet(), "usage");
      this.usage = Objects.requireNonNull(usage, "usage");
      optBits |= OPT_BIT_USAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure_SupplementalData#usage() usage} to usage.
     * @param usage The value for usage
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("usage")
    public final Builder usage(Optional<? extends List<CodeableConcept>> usage) {
      checkNotIsSet(usageIsSet(), "usage");
      this.usage = usage.orElse(null);
      optBits |= OPT_BIT_USAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure_SupplementalData#description() description} to description.
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
     * Initializes the optional value {@link Measure_SupplementalData#description() description} to description.
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
     * Initializes the value for the {@link Measure_SupplementalData#criteria() criteria} attribute.
     * @param criteria The value for criteria 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("criteria")
    public final Builder criteria(Expression criteria) {
      checkNotIsSet(criteriaIsSet(), "criteria");
      this.criteria = Objects.requireNonNull(criteria, "criteria");
      initBits &= ~INIT_BIT_CRITERIA;
      return this;
    }

    /**
     * Builds a new {@link Measure_SupplementalData Measure_SupplementalData}.
     * @return An immutable instance of Measure_SupplementalData
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Measure_SupplementalData build() {
      checkRequiredAttributes();
      return new ImmutableMeasure_SupplementalData(extension, modifierExtension, id, code, usage, description, criteria);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
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

    private boolean usageIsSet() {
      return (optBits & OPT_BIT_USAGE) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean criteriaIsSet() {
      return (initBits & INIT_BIT_CRITERIA) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Measure_SupplementalData is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!criteriaIsSet()) attributes.add("criteria");
      return "Cannot build Measure_SupplementalData, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Measure_SupplementalData", generator = "Immutables")
  public interface CriteriaBuildStage {
    /**
     * Initializes the value for the {@link Measure_SupplementalData#criteria() criteria} attribute.
     * @param criteria The value for criteria 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal criteria(Expression criteria);
  }

  @Generated(from = "Measure_SupplementalData", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Measure_SupplementalData#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Measure_SupplementalData#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Measure_SupplementalData#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Measure_SupplementalData#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Measure_SupplementalData#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link Measure_SupplementalData#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link Measure_SupplementalData#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(CodeableConcept code);

    /**
     * Initializes the optional value {@link Measure_SupplementalData#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(Optional<? extends CodeableConcept> code);

    /**
     * Initializes the optional value {@link Measure_SupplementalData#usage() usage} to usage.
     * @param usage The value for usage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal usage(List<CodeableConcept> usage);

    /**
     * Initializes the optional value {@link Measure_SupplementalData#usage() usage} to usage.
     * @param usage The value for usage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal usage(Optional<? extends List<CodeableConcept>> usage);

    /**
     * Initializes the optional value {@link Measure_SupplementalData#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(String description);

    /**
     * Initializes the optional value {@link Measure_SupplementalData#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<String> description);

    /**
     * Builds a new {@link Measure_SupplementalData Measure_SupplementalData}.
     * @return An immutable instance of Measure_SupplementalData
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Measure_SupplementalData build();
  }
}
