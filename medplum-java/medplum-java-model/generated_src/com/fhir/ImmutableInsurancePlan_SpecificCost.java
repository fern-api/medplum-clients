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
 * Immutable implementation of {@link InsurancePlan_SpecificCost}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableInsurancePlan_SpecificCost.builder()}.
 */
@Generated(from = "InsurancePlan_SpecificCost", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableInsurancePlan_SpecificCost implements InsurancePlan_SpecificCost {
  private final @Nullable List<InsurancePlan_Benefit1> benefit;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final CodeableConcept category;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableInsurancePlan_SpecificCost(
      @Nullable List<InsurancePlan_Benefit1> benefit,
      @Nullable String id,
      @Nullable List<Extension> extension,
      CodeableConcept category,
      @Nullable List<Extension> modifierExtension) {
    this.benefit = benefit;
    this.id = id;
    this.extension = extension;
    this.category = category;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code benefit} attribute
   */
  @JsonProperty("benefit")
  @Override
  public Optional<List<InsurancePlan_Benefit1>> benefit() {
    return Optional.ofNullable(benefit);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code category} attribute
   */
  @JsonProperty("category")
  @Override
  public CodeableConcept category() {
    return category;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_SpecificCost#benefit() benefit} attribute.
   * @param value The value for benefit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_SpecificCost withBenefit(List<InsurancePlan_Benefit1> value) {
    @Nullable List<InsurancePlan_Benefit1> newValue = Objects.requireNonNull(value, "benefit");
    if (this.benefit == newValue) return this;
    return new ImmutableInsurancePlan_SpecificCost(newValue, this.id, this.extension, this.category, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_SpecificCost#benefit() benefit} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for benefit
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_SpecificCost withBenefit(Optional<? extends List<InsurancePlan_Benefit1>> optional) {
    @Nullable List<InsurancePlan_Benefit1> value = optional.orElse(null);
    if (this.benefit == value) return this;
    return new ImmutableInsurancePlan_SpecificCost(value, this.id, this.extension, this.category, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_SpecificCost#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_SpecificCost withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableInsurancePlan_SpecificCost(this.benefit, newValue, this.extension, this.category, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_SpecificCost#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_SpecificCost withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableInsurancePlan_SpecificCost(this.benefit, value, this.extension, this.category, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_SpecificCost#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_SpecificCost withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableInsurancePlan_SpecificCost(this.benefit, this.id, newValue, this.category, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_SpecificCost#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_SpecificCost withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableInsurancePlan_SpecificCost(this.benefit, this.id, value, this.category, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InsurancePlan_SpecificCost#category() category} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for category
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInsurancePlan_SpecificCost withCategory(CodeableConcept value) {
    if (this.category == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "category");
    return new ImmutableInsurancePlan_SpecificCost(this.benefit, this.id, this.extension, newValue, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_SpecificCost#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_SpecificCost withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableInsurancePlan_SpecificCost(this.benefit, this.id, this.extension, this.category, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_SpecificCost#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_SpecificCost withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableInsurancePlan_SpecificCost(this.benefit, this.id, this.extension, this.category, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableInsurancePlan_SpecificCost} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableInsurancePlan_SpecificCost
        && equalTo((ImmutableInsurancePlan_SpecificCost) another);
  }

  private boolean equalTo(ImmutableInsurancePlan_SpecificCost another) {
    return Objects.equals(benefit, another.benefit)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && category.equals(another.category)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code benefit}, {@code id}, {@code extension}, {@code category}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(benefit);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + category.hashCode();
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code InsurancePlan_SpecificCost} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("InsurancePlan_SpecificCost{");
    if (benefit != null) {
      builder.append("benefit=").append(benefit);
    }
    if (id != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 27) builder.append(", ");
    builder.append("category=").append(category);
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "InsurancePlan_SpecificCost", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements InsurancePlan_SpecificCost {
    @Nullable Optional<List<InsurancePlan_Benefit1>> benefit = Optional.empty();
    boolean benefitIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable CodeableConcept category;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("benefit")
    public void setBenefit(Optional<List<InsurancePlan_Benefit1>> benefit) {
      this.benefit = benefit;
      this.benefitIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("category")
    public void setCategory(CodeableConcept category) {
      this.category = category;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<List<InsurancePlan_Benefit1>> benefit() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept category() { throw new UnsupportedOperationException(); }
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
  static ImmutableInsurancePlan_SpecificCost fromJson(Json json) {
    ImmutableInsurancePlan_SpecificCost.Builder builder = ((ImmutableInsurancePlan_SpecificCost.Builder) ImmutableInsurancePlan_SpecificCost.builder());
    if (json.benefitIsSet) {
      builder.benefit(json.benefit);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.category != null) {
      builder.category(json.category);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableInsurancePlan_SpecificCost) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link InsurancePlan_SpecificCost} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable InsurancePlan_SpecificCost instance
   */
  public static InsurancePlan_SpecificCost copyOf(InsurancePlan_SpecificCost instance) {
    if (instance instanceof ImmutableInsurancePlan_SpecificCost) {
      return (ImmutableInsurancePlan_SpecificCost) instance;
    }
    return ((ImmutableInsurancePlan_SpecificCost.Builder) ImmutableInsurancePlan_SpecificCost.builder())
        .benefit(instance.benefit())
        .id(instance.id())
        .extension(instance.extension())
        .category(instance.category())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link InsurancePlan_SpecificCost InsurancePlan_SpecificCost}.
   * <pre>
   * ImmutableInsurancePlan_SpecificCost.builder()
   *    .benefit(List&amp;lt;com.fhir.InsurancePlan_Benefit1&amp;gt;) // optional {@link InsurancePlan_SpecificCost#benefit() benefit}
   *    .id(String) // optional {@link InsurancePlan_SpecificCost#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link InsurancePlan_SpecificCost#extension() extension}
   *    .category(com.fhir.CodeableConcept) // required {@link InsurancePlan_SpecificCost#category() category}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link InsurancePlan_SpecificCost#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new InsurancePlan_SpecificCost builder
   */
  public static CategoryBuildStage builder() {
    return new ImmutableInsurancePlan_SpecificCost.Builder();
  }

  /**
   * Builds instances of type {@link InsurancePlan_SpecificCost InsurancePlan_SpecificCost}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "InsurancePlan_SpecificCost", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements CategoryBuildStage, BuildFinal {
    private static final long INIT_BIT_CATEGORY = 0x1L;
    private static final long OPT_BIT_BENEFIT = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<InsurancePlan_Benefit1> benefit;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept category;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link InsurancePlan_SpecificCost#benefit() benefit} to benefit.
     * @param benefit The value for benefit
     * @return {@code this} builder for chained invocation
     */
    public final Builder benefit(List<InsurancePlan_Benefit1> benefit) {
      checkNotIsSet(benefitIsSet(), "benefit");
      this.benefit = Objects.requireNonNull(benefit, "benefit");
      optBits |= OPT_BIT_BENEFIT;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_SpecificCost#benefit() benefit} to benefit.
     * @param benefit The value for benefit
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("benefit")
    public final Builder benefit(Optional<? extends List<InsurancePlan_Benefit1>> benefit) {
      checkNotIsSet(benefitIsSet(), "benefit");
      this.benefit = benefit.orElse(null);
      optBits |= OPT_BIT_BENEFIT;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_SpecificCost#id() id} to id.
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
     * Initializes the optional value {@link InsurancePlan_SpecificCost#id() id} to id.
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
     * Initializes the optional value {@link InsurancePlan_SpecificCost#extension() extension} to extension.
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
     * Initializes the optional value {@link InsurancePlan_SpecificCost#extension() extension} to extension.
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
     * Initializes the value for the {@link InsurancePlan_SpecificCost#category() category} attribute.
     * @param category The value for category 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("category")
    public final Builder category(CodeableConcept category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = Objects.requireNonNull(category, "category");
      initBits &= ~INIT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_SpecificCost#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link InsurancePlan_SpecificCost#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link InsurancePlan_SpecificCost InsurancePlan_SpecificCost}.
     * @return An immutable instance of InsurancePlan_SpecificCost
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public InsurancePlan_SpecificCost build() {
      checkRequiredAttributes();
      return new ImmutableInsurancePlan_SpecificCost(benefit, id, extension, category, modifierExtension);
    }

    private boolean benefitIsSet() {
      return (optBits & OPT_BIT_BENEFIT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean categoryIsSet() {
      return (initBits & INIT_BIT_CATEGORY) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of InsurancePlan_SpecificCost is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!categoryIsSet()) attributes.add("category");
      return "Cannot build InsurancePlan_SpecificCost, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "InsurancePlan_SpecificCost", generator = "Immutables")
  public interface CategoryBuildStage {
    /**
     * Initializes the value for the {@link InsurancePlan_SpecificCost#category() category} attribute.
     * @param category The value for category 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(CodeableConcept category);
  }

  @Generated(from = "InsurancePlan_SpecificCost", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link InsurancePlan_SpecificCost#benefit() benefit} to benefit.
     * @param benefit The value for benefit
     * @return {@code this} builder for chained invocation
     */
    BuildFinal benefit(List<InsurancePlan_Benefit1> benefit);

    /**
     * Initializes the optional value {@link InsurancePlan_SpecificCost#benefit() benefit} to benefit.
     * @param benefit The value for benefit
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal benefit(Optional<? extends List<InsurancePlan_Benefit1>> benefit);

    /**
     * Initializes the optional value {@link InsurancePlan_SpecificCost#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link InsurancePlan_SpecificCost#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link InsurancePlan_SpecificCost#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link InsurancePlan_SpecificCost#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link InsurancePlan_SpecificCost#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link InsurancePlan_SpecificCost#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Builds a new {@link InsurancePlan_SpecificCost InsurancePlan_SpecificCost}.
     * @return An immutable instance of InsurancePlan_SpecificCost
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    InsurancePlan_SpecificCost build();
  }
}
