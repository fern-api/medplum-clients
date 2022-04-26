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
 * Immutable implementation of {@link MedicinalProductPharmaceutical_WithdrawalPeriod}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod.builder()}.
 */
@Generated(from = "MedicinalProductPharmaceutical_WithdrawalPeriod", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod
    implements MedicinalProductPharmaceutical_WithdrawalPeriod {
  private final @Nullable String supportingInformation;
  private final CodeableConcept tissue;
  private final @Nullable List<Extension> modifierExtension;
  private final Quantity value;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;

  private ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod(
      @Nullable String supportingInformation,
      CodeableConcept tissue,
      @Nullable List<Extension> modifierExtension,
      Quantity value,
      @Nullable List<Extension> extension,
      @Nullable String id) {
    this.supportingInformation = supportingInformation;
    this.tissue = tissue;
    this.modifierExtension = modifierExtension;
    this.value = value;
    this.extension = extension;
    this.id = id;
  }

  /**
   * @return The value of the {@code supportingInformation} attribute
   */
  @JsonProperty("supportingInformation")
  @Override
  public Optional<String> supportingInformation() {
    return Optional.ofNullable(supportingInformation);
  }

  /**
   * @return The value of the {@code tissue} attribute
   */
  @JsonProperty("tissue")
  @Override
  public CodeableConcept tissue() {
    return tissue;
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
   * @return The value of the {@code value} attribute
   */
  @JsonProperty("value")
  @Override
  public Quantity value() {
    return value;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical_WithdrawalPeriod#supportingInformation() supportingInformation} attribute.
   * @param value The value for supportingInformation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod withSupportingInformation(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "supportingInformation");
    if (Objects.equals(this.supportingInformation, newValue)) return this;
    return new ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod(newValue, this.tissue, this.modifierExtension, this.value, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical_WithdrawalPeriod#supportingInformation() supportingInformation} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supportingInformation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod withSupportingInformation(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.supportingInformation, value)) return this;
    return new ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod(value, this.tissue, this.modifierExtension, this.value, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductPharmaceutical_WithdrawalPeriod#tissue() tissue} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for tissue
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod withTissue(CodeableConcept value) {
    if (this.tissue == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "tissue");
    return new ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod(
        this.supportingInformation,
        newValue,
        this.modifierExtension,
        this.value,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical_WithdrawalPeriod#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod(this.supportingInformation, this.tissue, newValue, this.value, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical_WithdrawalPeriod#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod(this.supportingInformation, this.tissue, value, this.value, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductPharmaceutical_WithdrawalPeriod#value() value} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for value
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod withValue(Quantity value) {
    if (this.value == value) return this;
    Quantity newValue = Objects.requireNonNull(value, "value");
    return new ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod(
        this.supportingInformation,
        this.tissue,
        this.modifierExtension,
        newValue,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical_WithdrawalPeriod#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod(this.supportingInformation, this.tissue, this.modifierExtension, this.value, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical_WithdrawalPeriod#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod(this.supportingInformation, this.tissue, this.modifierExtension, this.value, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical_WithdrawalPeriod#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod(
        this.supportingInformation,
        this.tissue,
        this.modifierExtension,
        this.value,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical_WithdrawalPeriod#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod(
        this.supportingInformation,
        this.tissue,
        this.modifierExtension,
        this.value,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod
        && equalTo((ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod) another);
  }

  private boolean equalTo(ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod another) {
    return Objects.equals(supportingInformation, another.supportingInformation)
        && tissue.equals(another.tissue)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && value.equals(another.value)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code supportingInformation}, {@code tissue}, {@code modifierExtension}, {@code value}, {@code extension}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(supportingInformation);
    h += (h << 5) + tissue.hashCode();
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + value.hashCode();
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicinalProductPharmaceutical_WithdrawalPeriod} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicinalProductPharmaceutical_WithdrawalPeriod{");
    if (supportingInformation != null) {
      builder.append("supportingInformation=").append(supportingInformation);
    }
    if (builder.length() > 48) builder.append(", ");
    builder.append("tissue=").append(tissue);
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    builder.append(", ");
    builder.append("value=").append(value);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicinalProductPharmaceutical_WithdrawalPeriod", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicinalProductPharmaceutical_WithdrawalPeriod {
    @Nullable Optional<String> supportingInformation = Optional.empty();
    boolean supportingInformationIsSet;
    @Nullable CodeableConcept tissue;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Quantity value;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("supportingInformation")
    public void setSupportingInformation(Optional<String> supportingInformation) {
      this.supportingInformation = supportingInformation;
      this.supportingInformationIsSet = true;
    }
    @JsonProperty("tissue")
    public void setTissue(CodeableConcept tissue) {
      this.tissue = tissue;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("value")
    public void setValue(Quantity value) {
      this.value = value;
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
    @Override
    public Optional<String> supportingInformation() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept tissue() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Quantity value() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod fromJson(Json json) {
    ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod.Builder builder = ((ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod.Builder) ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod.builder());
    if (json.supportingInformationIsSet) {
      builder.supportingInformation(json.supportingInformation);
    }
    if (json.tissue != null) {
      builder.tissue(json.tissue);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.value != null) {
      builder.value(json.value);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicinalProductPharmaceutical_WithdrawalPeriod} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicinalProductPharmaceutical_WithdrawalPeriod instance
   */
  public static MedicinalProductPharmaceutical_WithdrawalPeriod copyOf(MedicinalProductPharmaceutical_WithdrawalPeriod instance) {
    if (instance instanceof ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod) {
      return (ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod) instance;
    }
    return ((ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod.Builder) ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod.builder())
        .supportingInformation(instance.supportingInformation())
        .tissue(instance.tissue())
        .modifierExtension(instance.modifierExtension())
        .value(instance.value())
        .extension(instance.extension())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link MedicinalProductPharmaceutical_WithdrawalPeriod MedicinalProductPharmaceutical_WithdrawalPeriod}.
   * <pre>
   * ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod.builder()
   *    .supportingInformation(String) // optional {@link MedicinalProductPharmaceutical_WithdrawalPeriod#supportingInformation() supportingInformation}
   *    .tissue(com.fhir.types.fhir.CodeableConcept) // required {@link MedicinalProductPharmaceutical_WithdrawalPeriod#tissue() tissue}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProductPharmaceutical_WithdrawalPeriod#modifierExtension() modifierExtension}
   *    .value(com.fhir.types.fhir.Quantity) // required {@link MedicinalProductPharmaceutical_WithdrawalPeriod#value() value}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProductPharmaceutical_WithdrawalPeriod#extension() extension}
   *    .id(String) // optional {@link MedicinalProductPharmaceutical_WithdrawalPeriod#id() id}
   *    .build();
   * </pre>
   * @return A new MedicinalProductPharmaceutical_WithdrawalPeriod builder
   */
  public static TissueBuildStage builder() {
    return new ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod.Builder();
  }

  /**
   * Builds instances of type {@link MedicinalProductPharmaceutical_WithdrawalPeriod MedicinalProductPharmaceutical_WithdrawalPeriod}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicinalProductPharmaceutical_WithdrawalPeriod", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements TissueBuildStage, ValueBuildStage, BuildFinal {
    private static final long INIT_BIT_TISSUE = 0x1L;
    private static final long INIT_BIT_VALUE = 0x2L;
    private static final long OPT_BIT_SUPPORTING_INFORMATION = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable String supportingInformation;
    private @Nullable CodeableConcept tissue;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Quantity value;
    private @Nullable List<Extension> extension;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_WithdrawalPeriod#supportingInformation() supportingInformation} to supportingInformation.
     * @param supportingInformation The value for supportingInformation
     * @return {@code this} builder for chained invocation
     */
    public final Builder supportingInformation(String supportingInformation) {
      checkNotIsSet(supportingInformationIsSet(), "supportingInformation");
      this.supportingInformation = Objects.requireNonNull(supportingInformation, "supportingInformation");
      optBits |= OPT_BIT_SUPPORTING_INFORMATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_WithdrawalPeriod#supportingInformation() supportingInformation} to supportingInformation.
     * @param supportingInformation The value for supportingInformation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("supportingInformation")
    public final Builder supportingInformation(Optional<String> supportingInformation) {
      checkNotIsSet(supportingInformationIsSet(), "supportingInformation");
      this.supportingInformation = supportingInformation.orElse(null);
      optBits |= OPT_BIT_SUPPORTING_INFORMATION;
      return this;
    }

    /**
     * Initializes the value for the {@link MedicinalProductPharmaceutical_WithdrawalPeriod#tissue() tissue} attribute.
     * @param tissue The value for tissue 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("tissue")
    public final Builder tissue(CodeableConcept tissue) {
      checkNotIsSet(tissueIsSet(), "tissue");
      this.tissue = Objects.requireNonNull(tissue, "tissue");
      initBits &= ~INIT_BIT_TISSUE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_WithdrawalPeriod#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical_WithdrawalPeriod#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the value for the {@link MedicinalProductPharmaceutical_WithdrawalPeriod#value() value} attribute.
     * @param value The value for value 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("value")
    public final Builder value(Quantity value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = Objects.requireNonNull(value, "value");
      initBits &= ~INIT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_WithdrawalPeriod#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical_WithdrawalPeriod#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical_WithdrawalPeriod#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical_WithdrawalPeriod#id() id} to id.
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
     * Builds a new {@link MedicinalProductPharmaceutical_WithdrawalPeriod MedicinalProductPharmaceutical_WithdrawalPeriod}.
     * @return An immutable instance of MedicinalProductPharmaceutical_WithdrawalPeriod
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicinalProductPharmaceutical_WithdrawalPeriod build() {
      checkRequiredAttributes();
      return new ImmutableMedicinalProductPharmaceutical_WithdrawalPeriod(supportingInformation, tissue, modifierExtension, value, extension, id);
    }

    private boolean supportingInformationIsSet() {
      return (optBits & OPT_BIT_SUPPORTING_INFORMATION) != 0;
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

    private boolean tissueIsSet() {
      return (initBits & INIT_BIT_TISSUE) == 0;
    }

    private boolean valueIsSet() {
      return (initBits & INIT_BIT_VALUE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicinalProductPharmaceutical_WithdrawalPeriod is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!tissueIsSet()) attributes.add("tissue");
      if (!valueIsSet()) attributes.add("value");
      return "Cannot build MedicinalProductPharmaceutical_WithdrawalPeriod, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MedicinalProductPharmaceutical_WithdrawalPeriod", generator = "Immutables")
  public interface TissueBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductPharmaceutical_WithdrawalPeriod#tissue() tissue} attribute.
     * @param tissue The value for tissue 
     * @return {@code this} builder for use in a chained invocation
     */
    ValueBuildStage tissue(CodeableConcept tissue);
  }

  @Generated(from = "MedicinalProductPharmaceutical_WithdrawalPeriod", generator = "Immutables")
  public interface ValueBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductPharmaceutical_WithdrawalPeriod#value() value} attribute.
     * @param value The value for value 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal value(Quantity value);
  }

  @Generated(from = "MedicinalProductPharmaceutical_WithdrawalPeriod", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_WithdrawalPeriod#supportingInformation() supportingInformation} to supportingInformation.
     * @param supportingInformation The value for supportingInformation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal supportingInformation(String supportingInformation);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_WithdrawalPeriod#supportingInformation() supportingInformation} to supportingInformation.
     * @param supportingInformation The value for supportingInformation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal supportingInformation(Optional<String> supportingInformation);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_WithdrawalPeriod#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_WithdrawalPeriod#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_WithdrawalPeriod#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_WithdrawalPeriod#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_WithdrawalPeriod#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_WithdrawalPeriod#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Builds a new {@link MedicinalProductPharmaceutical_WithdrawalPeriod MedicinalProductPharmaceutical_WithdrawalPeriod}.
     * @return An immutable instance of MedicinalProductPharmaceutical_WithdrawalPeriod
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicinalProductPharmaceutical_WithdrawalPeriod build();
  }
}
