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
 * Immutable implementation of {@link SubstancePolymer_DegreeOfPolymerisation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstancePolymer_DegreeOfPolymerisation.builder()}.
 */
@Generated(from = "SubstancePolymer_DegreeOfPolymerisation", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstancePolymer_DegreeOfPolymerisation
    implements SubstancePolymer_DegreeOfPolymerisation {
  private final @Nullable String id;
  private final @Nullable SubstanceAmount amount;
  private final @Nullable CodeableConcept degree;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;

  private ImmutableSubstancePolymer_DegreeOfPolymerisation(
      @Nullable String id,
      @Nullable SubstanceAmount amount,
      @Nullable CodeableConcept degree,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension) {
    this.id = id;
    this.amount = amount;
    this.degree = degree;
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
   * @return The value of the {@code amount} attribute
   */
  @JsonProperty("amount")
  @Override
  public Optional<SubstanceAmount> amount() {
    return Optional.ofNullable(amount);
  }

  /**
   * @return The value of the {@code degree} attribute
   */
  @JsonProperty("degree")
  @Override
  public Optional<CodeableConcept> degree() {
    return Optional.ofNullable(degree);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer_DegreeOfPolymerisation#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_DegreeOfPolymerisation withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSubstancePolymer_DegreeOfPolymerisation(newValue, this.amount, this.degree, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer_DegreeOfPolymerisation#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_DegreeOfPolymerisation withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSubstancePolymer_DegreeOfPolymerisation(value, this.amount, this.degree, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer_DegreeOfPolymerisation#amount() amount} attribute.
   * @param value The value for amount
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_DegreeOfPolymerisation withAmount(SubstanceAmount value) {
    @Nullable SubstanceAmount newValue = Objects.requireNonNull(value, "amount");
    if (this.amount == newValue) return this;
    return new ImmutableSubstancePolymer_DegreeOfPolymerisation(this.id, newValue, this.degree, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer_DegreeOfPolymerisation#amount() amount} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for amount
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer_DegreeOfPolymerisation withAmount(Optional<? extends SubstanceAmount> optional) {
    @Nullable SubstanceAmount value = optional.orElse(null);
    if (this.amount == value) return this;
    return new ImmutableSubstancePolymer_DegreeOfPolymerisation(this.id, value, this.degree, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer_DegreeOfPolymerisation#degree() degree} attribute.
   * @param value The value for degree
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_DegreeOfPolymerisation withDegree(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "degree");
    if (this.degree == newValue) return this;
    return new ImmutableSubstancePolymer_DegreeOfPolymerisation(this.id, this.amount, newValue, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer_DegreeOfPolymerisation#degree() degree} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for degree
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer_DegreeOfPolymerisation withDegree(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.degree == value) return this;
    return new ImmutableSubstancePolymer_DegreeOfPolymerisation(this.id, this.amount, value, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer_DegreeOfPolymerisation#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_DegreeOfPolymerisation withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstancePolymer_DegreeOfPolymerisation(this.id, this.amount, this.degree, newValue, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer_DegreeOfPolymerisation#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer_DegreeOfPolymerisation withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstancePolymer_DegreeOfPolymerisation(this.id, this.amount, this.degree, value, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer_DegreeOfPolymerisation#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_DegreeOfPolymerisation withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstancePolymer_DegreeOfPolymerisation(this.id, this.amount, this.degree, this.modifierExtension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer_DegreeOfPolymerisation#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer_DegreeOfPolymerisation withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstancePolymer_DegreeOfPolymerisation(this.id, this.amount, this.degree, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstancePolymer_DegreeOfPolymerisation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstancePolymer_DegreeOfPolymerisation
        && equalTo((ImmutableSubstancePolymer_DegreeOfPolymerisation) another);
  }

  private boolean equalTo(ImmutableSubstancePolymer_DegreeOfPolymerisation another) {
    return Objects.equals(id, another.id)
        && Objects.equals(amount, another.amount)
        && Objects.equals(degree, another.degree)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code amount}, {@code degree}, {@code modifierExtension}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(amount);
    h += (h << 5) + Objects.hashCode(degree);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstancePolymer_DegreeOfPolymerisation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SubstancePolymer_DegreeOfPolymerisation{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (amount != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("amount=").append(amount);
    }
    if (degree != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("degree=").append(degree);
    }
    if (modifierExtension != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SubstancePolymer_DegreeOfPolymerisation", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SubstancePolymer_DegreeOfPolymerisation {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<SubstanceAmount> amount = Optional.empty();
    boolean amountIsSet;
    @Nullable Optional<CodeableConcept> degree = Optional.empty();
    boolean degreeIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("amount")
    public void setAmount(Optional<SubstanceAmount> amount) {
      this.amount = amount;
      this.amountIsSet = true;
    }
    @JsonProperty("degree")
    public void setDegree(Optional<CodeableConcept> degree) {
      this.degree = degree;
      this.degreeIsSet = true;
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
    public Optional<SubstanceAmount> amount() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> degree() { throw new UnsupportedOperationException(); }
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
  static ImmutableSubstancePolymer_DegreeOfPolymerisation fromJson(Json json) {
    ImmutableSubstancePolymer_DegreeOfPolymerisation.Builder builder = ImmutableSubstancePolymer_DegreeOfPolymerisation.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.amountIsSet) {
      builder.amount(json.amount);
    }
    if (json.degreeIsSet) {
      builder.degree(json.degree);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableSubstancePolymer_DegreeOfPolymerisation) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubstancePolymer_DegreeOfPolymerisation} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubstancePolymer_DegreeOfPolymerisation instance
   */
  public static SubstancePolymer_DegreeOfPolymerisation copyOf(SubstancePolymer_DegreeOfPolymerisation instance) {
    if (instance instanceof ImmutableSubstancePolymer_DegreeOfPolymerisation) {
      return (ImmutableSubstancePolymer_DegreeOfPolymerisation) instance;
    }
    return ImmutableSubstancePolymer_DegreeOfPolymerisation.builder()
        .id(instance.id())
        .amount(instance.amount())
        .degree(instance.degree())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link SubstancePolymer_DegreeOfPolymerisation SubstancePolymer_DegreeOfPolymerisation}.
   * <pre>
   * ImmutableSubstancePolymer_DegreeOfPolymerisation.builder()
   *    .id(String) // optional {@link SubstancePolymer_DegreeOfPolymerisation#id() id}
   *    .amount(com.fhir.SubstanceAmount) // optional {@link SubstancePolymer_DegreeOfPolymerisation#amount() amount}
   *    .degree(com.fhir.CodeableConcept) // optional {@link SubstancePolymer_DegreeOfPolymerisation#degree() degree}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SubstancePolymer_DegreeOfPolymerisation#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SubstancePolymer_DegreeOfPolymerisation#extension() extension}
   *    .build();
   * </pre>
   * @return A new SubstancePolymer_DegreeOfPolymerisation builder
   */
  public static ImmutableSubstancePolymer_DegreeOfPolymerisation.Builder builder() {
    return new ImmutableSubstancePolymer_DegreeOfPolymerisation.Builder();
  }

  /**
   * Builds instances of type {@link SubstancePolymer_DegreeOfPolymerisation SubstancePolymer_DegreeOfPolymerisation}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SubstancePolymer_DegreeOfPolymerisation", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_AMOUNT = 0x2L;
    private static final long OPT_BIT_DEGREE = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private long optBits;

    private @Nullable String id;
    private @Nullable SubstanceAmount amount;
    private @Nullable CodeableConcept degree;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstancePolymer_DegreeOfPolymerisation#id() id} to id.
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
     * Initializes the optional value {@link SubstancePolymer_DegreeOfPolymerisation#id() id} to id.
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
     * Initializes the optional value {@link SubstancePolymer_DegreeOfPolymerisation#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for chained invocation
     */
    public final Builder amount(SubstanceAmount amount) {
      checkNotIsSet(amountIsSet(), "amount");
      this.amount = Objects.requireNonNull(amount, "amount");
      optBits |= OPT_BIT_AMOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer_DegreeOfPolymerisation#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("amount")
    public final Builder amount(Optional<? extends SubstanceAmount> amount) {
      checkNotIsSet(amountIsSet(), "amount");
      this.amount = amount.orElse(null);
      optBits |= OPT_BIT_AMOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer_DegreeOfPolymerisation#degree() degree} to degree.
     * @param degree The value for degree
     * @return {@code this} builder for chained invocation
     */
    public final Builder degree(CodeableConcept degree) {
      checkNotIsSet(degreeIsSet(), "degree");
      this.degree = Objects.requireNonNull(degree, "degree");
      optBits |= OPT_BIT_DEGREE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer_DegreeOfPolymerisation#degree() degree} to degree.
     * @param degree The value for degree
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("degree")
    public final Builder degree(Optional<? extends CodeableConcept> degree) {
      checkNotIsSet(degreeIsSet(), "degree");
      this.degree = degree.orElse(null);
      optBits |= OPT_BIT_DEGREE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer_DegreeOfPolymerisation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstancePolymer_DegreeOfPolymerisation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstancePolymer_DegreeOfPolymerisation#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstancePolymer_DegreeOfPolymerisation#extension() extension} to extension.
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
     * Builds a new {@link SubstancePolymer_DegreeOfPolymerisation SubstancePolymer_DegreeOfPolymerisation}.
     * @return An immutable instance of SubstancePolymer_DegreeOfPolymerisation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SubstancePolymer_DegreeOfPolymerisation build() {
      return new ImmutableSubstancePolymer_DegreeOfPolymerisation(id, amount, degree, modifierExtension, extension);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean amountIsSet() {
      return (optBits & OPT_BIT_AMOUNT) != 0;
    }

    private boolean degreeIsSet() {
      return (optBits & OPT_BIT_DEGREE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SubstancePolymer_DegreeOfPolymerisation is strict, attribute is already set: ".concat(name));
    }
  }
}
