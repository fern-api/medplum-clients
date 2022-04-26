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
 * Immutable implementation of {@link ProductShelfLife}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableProductShelfLife.builder()}.
 */
@Generated(from = "ProductShelfLife", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableProductShelfLife implements ProductShelfLife {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final @Nullable List<CodeableConcept> specialPrecautionsForStorage;
  private final @Nullable Identifier identifier;
  private final CodeableConcept type;
  private final Quantity period;
  private final @Nullable List<Extension> extension;

  private ImmutableProductShelfLife(
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      @Nullable List<CodeableConcept> specialPrecautionsForStorage,
      @Nullable Identifier identifier,
      CodeableConcept type,
      Quantity period,
      @Nullable List<Extension> extension) {
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.specialPrecautionsForStorage = specialPrecautionsForStorage;
    this.identifier = identifier;
    this.type = type;
    this.period = period;
    this.extension = extension;
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
   * @return The value of the {@code specialPrecautionsForStorage} attribute
   */
  @JsonProperty("specialPrecautionsForStorage")
  @Override
  public Optional<List<CodeableConcept>> specialPrecautionsForStorage() {
    return Optional.ofNullable(specialPrecautionsForStorage);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<Identifier> identifier() {
    return Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public CodeableConcept type() {
    return type;
  }

  /**
   * @return The value of the {@code period} attribute
   */
  @JsonProperty("period")
  @Override
  public Quantity period() {
    return period;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ProductShelfLife#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProductShelfLife withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableProductShelfLife(
        newValue,
        this.id,
        this.specialPrecautionsForStorage,
        this.identifier,
        this.type,
        this.period,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ProductShelfLife#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProductShelfLife withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableProductShelfLife(
        value,
        this.id,
        this.specialPrecautionsForStorage,
        this.identifier,
        this.type,
        this.period,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ProductShelfLife#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProductShelfLife withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableProductShelfLife(
        this.modifierExtension,
        newValue,
        this.specialPrecautionsForStorage,
        this.identifier,
        this.type,
        this.period,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ProductShelfLife#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProductShelfLife withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableProductShelfLife(
        this.modifierExtension,
        value,
        this.specialPrecautionsForStorage,
        this.identifier,
        this.type,
        this.period,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ProductShelfLife#specialPrecautionsForStorage() specialPrecautionsForStorage} attribute.
   * @param value The value for specialPrecautionsForStorage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProductShelfLife withSpecialPrecautionsForStorage(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "specialPrecautionsForStorage");
    if (this.specialPrecautionsForStorage == newValue) return this;
    return new ImmutableProductShelfLife(
        this.modifierExtension,
        this.id,
        newValue,
        this.identifier,
        this.type,
        this.period,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ProductShelfLife#specialPrecautionsForStorage() specialPrecautionsForStorage} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specialPrecautionsForStorage
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProductShelfLife withSpecialPrecautionsForStorage(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.specialPrecautionsForStorage == value) return this;
    return new ImmutableProductShelfLife(this.modifierExtension, this.id, value, this.identifier, this.type, this.period, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ProductShelfLife#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProductShelfLife withIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableProductShelfLife(
        this.modifierExtension,
        this.id,
        this.specialPrecautionsForStorage,
        newValue,
        this.type,
        this.period,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ProductShelfLife#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProductShelfLife withIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableProductShelfLife(
        this.modifierExtension,
        this.id,
        this.specialPrecautionsForStorage,
        value,
        this.type,
        this.period,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ProductShelfLife#type() type} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableProductShelfLife withType(CodeableConcept value) {
    if (this.type == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "type");
    return new ImmutableProductShelfLife(
        this.modifierExtension,
        this.id,
        this.specialPrecautionsForStorage,
        this.identifier,
        newValue,
        this.period,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ProductShelfLife#period() period} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for period
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableProductShelfLife withPeriod(Quantity value) {
    if (this.period == value) return this;
    Quantity newValue = Objects.requireNonNull(value, "period");
    return new ImmutableProductShelfLife(
        this.modifierExtension,
        this.id,
        this.specialPrecautionsForStorage,
        this.identifier,
        this.type,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ProductShelfLife#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProductShelfLife withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableProductShelfLife(
        this.modifierExtension,
        this.id,
        this.specialPrecautionsForStorage,
        this.identifier,
        this.type,
        this.period,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ProductShelfLife#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProductShelfLife withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableProductShelfLife(
        this.modifierExtension,
        this.id,
        this.specialPrecautionsForStorage,
        this.identifier,
        this.type,
        this.period,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableProductShelfLife} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableProductShelfLife
        && equalTo((ImmutableProductShelfLife) another);
  }

  private boolean equalTo(ImmutableProductShelfLife another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(specialPrecautionsForStorage, another.specialPrecautionsForStorage)
        && Objects.equals(identifier, another.identifier)
        && type.equals(another.type)
        && period.equals(another.period)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code id}, {@code specialPrecautionsForStorage}, {@code identifier}, {@code type}, {@code period}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(specialPrecautionsForStorage);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + type.hashCode();
    h += (h << 5) + period.hashCode();
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code ProductShelfLife} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ProductShelfLife{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (specialPrecautionsForStorage != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("specialPrecautionsForStorage=").append(specialPrecautionsForStorage);
    }
    if (identifier != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (builder.length() > 17) builder.append(", ");
    builder.append("type=").append(type);
    builder.append(", ");
    builder.append("period=").append(period);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ProductShelfLife", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ProductShelfLife {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<CodeableConcept>> specialPrecautionsForStorage = Optional.empty();
    boolean specialPrecautionsForStorageIsSet;
    @Nullable Optional<Identifier> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable CodeableConcept type;
    @Nullable Quantity period;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
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
    @JsonProperty("specialPrecautionsForStorage")
    public void setSpecialPrecautionsForStorage(Optional<List<CodeableConcept>> specialPrecautionsForStorage) {
      this.specialPrecautionsForStorage = specialPrecautionsForStorage;
      this.specialPrecautionsForStorageIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("type")
    public void setType(CodeableConcept type) {
      this.type = type;
    }
    @JsonProperty("period")
    public void setPeriod(Quantity period) {
      this.period = period;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> specialPrecautionsForStorage() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept type() { throw new UnsupportedOperationException(); }
    @Override
    public Quantity period() { throw new UnsupportedOperationException(); }
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
  static ImmutableProductShelfLife fromJson(Json json) {
    ImmutableProductShelfLife.Builder builder = ((ImmutableProductShelfLife.Builder) ImmutableProductShelfLife.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.specialPrecautionsForStorageIsSet) {
      builder.specialPrecautionsForStorage(json.specialPrecautionsForStorage);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.period != null) {
      builder.period(json.period);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableProductShelfLife) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ProductShelfLife} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ProductShelfLife instance
   */
  public static ProductShelfLife copyOf(ProductShelfLife instance) {
    if (instance instanceof ImmutableProductShelfLife) {
      return (ImmutableProductShelfLife) instance;
    }
    return ((ImmutableProductShelfLife.Builder) ImmutableProductShelfLife.builder())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .specialPrecautionsForStorage(instance.specialPrecautionsForStorage())
        .identifier(instance.identifier())
        .type(instance.type())
        .period(instance.period())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link ProductShelfLife ProductShelfLife}.
   * <pre>
   * ImmutableProductShelfLife.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ProductShelfLife#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link ProductShelfLife#id() id}
   *    .specialPrecautionsForStorage(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link ProductShelfLife#specialPrecautionsForStorage() specialPrecautionsForStorage}
   *    .identifier(com.fhir.types.fhir.Identifier) // optional {@link ProductShelfLife#identifier() identifier}
   *    .type(com.fhir.types.fhir.CodeableConcept) // required {@link ProductShelfLife#type() type}
   *    .period(com.fhir.types.fhir.Quantity) // required {@link ProductShelfLife#period() period}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ProductShelfLife#extension() extension}
   *    .build();
   * </pre>
   * @return A new ProductShelfLife builder
   */
  public static TypeBuildStage builder() {
    return new ImmutableProductShelfLife.Builder();
  }

  /**
   * Builds instances of type {@link ProductShelfLife ProductShelfLife}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ProductShelfLife", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements TypeBuildStage, PeriodBuildStage, BuildFinal {
    private static final long INIT_BIT_TYPE = 0x1L;
    private static final long INIT_BIT_PERIOD = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_SPECIAL_PRECAUTIONS_FOR_STORAGE = 0x4L;
    private static final long OPT_BIT_IDENTIFIER = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable List<CodeableConcept> specialPrecautionsForStorage;
    private @Nullable Identifier identifier;
    private @Nullable CodeableConcept type;
    private @Nullable Quantity period;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ProductShelfLife#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ProductShelfLife#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ProductShelfLife#id() id} to id.
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
     * Initializes the optional value {@link ProductShelfLife#id() id} to id.
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
     * Initializes the optional value {@link ProductShelfLife#specialPrecautionsForStorage() specialPrecautionsForStorage} to specialPrecautionsForStorage.
     * @param specialPrecautionsForStorage The value for specialPrecautionsForStorage
     * @return {@code this} builder for chained invocation
     */
    public final Builder specialPrecautionsForStorage(List<CodeableConcept> specialPrecautionsForStorage) {
      checkNotIsSet(specialPrecautionsForStorageIsSet(), "specialPrecautionsForStorage");
      this.specialPrecautionsForStorage = Objects.requireNonNull(specialPrecautionsForStorage, "specialPrecautionsForStorage");
      optBits |= OPT_BIT_SPECIAL_PRECAUTIONS_FOR_STORAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ProductShelfLife#specialPrecautionsForStorage() specialPrecautionsForStorage} to specialPrecautionsForStorage.
     * @param specialPrecautionsForStorage The value for specialPrecautionsForStorage
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("specialPrecautionsForStorage")
    public final Builder specialPrecautionsForStorage(Optional<? extends List<CodeableConcept>> specialPrecautionsForStorage) {
      checkNotIsSet(specialPrecautionsForStorageIsSet(), "specialPrecautionsForStorage");
      this.specialPrecautionsForStorage = specialPrecautionsForStorage.orElse(null);
      optBits |= OPT_BIT_SPECIAL_PRECAUTIONS_FOR_STORAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ProductShelfLife#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(Identifier identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link ProductShelfLife#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifier")
    public final Builder identifier(Optional<? extends Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the value for the {@link ProductShelfLife#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link ProductShelfLife#period() period} attribute.
     * @param period The value for period 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("period")
    public final Builder period(Quantity period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = Objects.requireNonNull(period, "period");
      initBits &= ~INIT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ProductShelfLife#extension() extension} to extension.
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
     * Initializes the optional value {@link ProductShelfLife#extension() extension} to extension.
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
     * Builds a new {@link ProductShelfLife ProductShelfLife}.
     * @return An immutable instance of ProductShelfLife
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ProductShelfLife build() {
      checkRequiredAttributes();
      return new ImmutableProductShelfLife(modifierExtension, id, specialPrecautionsForStorage, identifier, type, period, extension);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean specialPrecautionsForStorageIsSet() {
      return (optBits & OPT_BIT_SPECIAL_PRECAUTIONS_FOR_STORAGE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (initBits & INIT_BIT_TYPE) == 0;
    }

    private boolean periodIsSet() {
      return (initBits & INIT_BIT_PERIOD) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ProductShelfLife is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!typeIsSet()) attributes.add("type");
      if (!periodIsSet()) attributes.add("period");
      return "Cannot build ProductShelfLife, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ProductShelfLife", generator = "Immutables")
  public interface TypeBuildStage {
    /**
     * Initializes the value for the {@link ProductShelfLife#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    PeriodBuildStage type(CodeableConcept type);
  }

  @Generated(from = "ProductShelfLife", generator = "Immutables")
  public interface PeriodBuildStage {
    /**
     * Initializes the value for the {@link ProductShelfLife#period() period} attribute.
     * @param period The value for period 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal period(Quantity period);
  }

  @Generated(from = "ProductShelfLife", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ProductShelfLife#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ProductShelfLife#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ProductShelfLife#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link ProductShelfLife#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link ProductShelfLife#specialPrecautionsForStorage() specialPrecautionsForStorage} to specialPrecautionsForStorage.
     * @param specialPrecautionsForStorage The value for specialPrecautionsForStorage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal specialPrecautionsForStorage(List<CodeableConcept> specialPrecautionsForStorage);

    /**
     * Initializes the optional value {@link ProductShelfLife#specialPrecautionsForStorage() specialPrecautionsForStorage} to specialPrecautionsForStorage.
     * @param specialPrecautionsForStorage The value for specialPrecautionsForStorage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal specialPrecautionsForStorage(Optional<? extends List<CodeableConcept>> specialPrecautionsForStorage);

    /**
     * Initializes the optional value {@link ProductShelfLife#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(Identifier identifier);

    /**
     * Initializes the optional value {@link ProductShelfLife#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends Identifier> identifier);

    /**
     * Initializes the optional value {@link ProductShelfLife#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ProductShelfLife#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Builds a new {@link ProductShelfLife ProductShelfLife}.
     * @return An immutable instance of ProductShelfLife
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ProductShelfLife build();
  }
}
