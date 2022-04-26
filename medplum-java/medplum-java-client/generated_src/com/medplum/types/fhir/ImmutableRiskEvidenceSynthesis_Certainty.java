package com.medplum.types.fhir;

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
 * Immutable implementation of {@link RiskEvidenceSynthesis_Certainty}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRiskEvidenceSynthesis_Certainty.builder()}.
 */
@Generated(from = "RiskEvidenceSynthesis_Certainty", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableRiskEvidenceSynthesis_Certainty
    implements RiskEvidenceSynthesis_Certainty {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<CodeableConcept> rating;
  private final @Nullable List<RiskEvidenceSynthesis_CertaintySubcomponent> certaintySubcomponent;
  private final @Nullable List<Annotation> note;

  private ImmutableRiskEvidenceSynthesis_Certainty(
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable List<CodeableConcept> rating,
      @Nullable List<RiskEvidenceSynthesis_CertaintySubcomponent> certaintySubcomponent,
      @Nullable List<Annotation> note) {
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.extension = extension;
    this.rating = rating;
    this.certaintySubcomponent = certaintySubcomponent;
    this.note = note;
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code rating} attribute
   */
  @JsonProperty("rating")
  @Override
  public Optional<List<CodeableConcept>> rating() {
    return Optional.ofNullable(rating);
  }

  /**
   * @return The value of the {@code certaintySubcomponent} attribute
   */
  @JsonProperty("certaintySubcomponent")
  @Override
  public Optional<List<RiskEvidenceSynthesis_CertaintySubcomponent>> certaintySubcomponent() {
    return Optional.ofNullable(certaintySubcomponent);
  }

  /**
   * @return The value of the {@code note} attribute
   */
  @JsonProperty("note")
  @Override
  public Optional<List<Annotation>> note() {
    return Optional.ofNullable(note);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_Certainty#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_Certainty withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis_Certainty(newValue, this.id, this.extension, this.rating, this.certaintySubcomponent, this.note);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_Certainty#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis_Certainty withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableRiskEvidenceSynthesis_Certainty(value, this.id, this.extension, this.rating, this.certaintySubcomponent, this.note);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_Certainty#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_Certainty withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableRiskEvidenceSynthesis_Certainty(
        this.modifierExtension,
        newValue,
        this.extension,
        this.rating,
        this.certaintySubcomponent,
        this.note);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_Certainty#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_Certainty withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableRiskEvidenceSynthesis_Certainty(
        this.modifierExtension,
        value,
        this.extension,
        this.rating,
        this.certaintySubcomponent,
        this.note);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_Certainty#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_Certainty withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis_Certainty(this.modifierExtension, this.id, newValue, this.rating, this.certaintySubcomponent, this.note);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_Certainty#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis_Certainty withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableRiskEvidenceSynthesis_Certainty(this.modifierExtension, this.id, value, this.rating, this.certaintySubcomponent, this.note);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_Certainty#rating() rating} attribute.
   * @param value The value for rating
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_Certainty withRating(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "rating");
    if (this.rating == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis_Certainty(
        this.modifierExtension,
        this.id,
        this.extension,
        newValue,
        this.certaintySubcomponent,
        this.note);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_Certainty#rating() rating} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for rating
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis_Certainty withRating(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.rating == value) return this;
    return new ImmutableRiskEvidenceSynthesis_Certainty(this.modifierExtension, this.id, this.extension, value, this.certaintySubcomponent, this.note);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_Certainty#certaintySubcomponent() certaintySubcomponent} attribute.
   * @param value The value for certaintySubcomponent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_Certainty withCertaintySubcomponent(List<RiskEvidenceSynthesis_CertaintySubcomponent> value) {
    @Nullable List<RiskEvidenceSynthesis_CertaintySubcomponent> newValue = Objects.requireNonNull(value, "certaintySubcomponent");
    if (this.certaintySubcomponent == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis_Certainty(this.modifierExtension, this.id, this.extension, this.rating, newValue, this.note);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_Certainty#certaintySubcomponent() certaintySubcomponent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for certaintySubcomponent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis_Certainty withCertaintySubcomponent(Optional<? extends List<RiskEvidenceSynthesis_CertaintySubcomponent>> optional) {
    @Nullable List<RiskEvidenceSynthesis_CertaintySubcomponent> value = optional.orElse(null);
    if (this.certaintySubcomponent == value) return this;
    return new ImmutableRiskEvidenceSynthesis_Certainty(this.modifierExtension, this.id, this.extension, this.rating, value, this.note);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_Certainty#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_Certainty withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis_Certainty(
        this.modifierExtension,
        this.id,
        this.extension,
        this.rating,
        this.certaintySubcomponent,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_Certainty#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis_Certainty withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableRiskEvidenceSynthesis_Certainty(this.modifierExtension, this.id, this.extension, this.rating, this.certaintySubcomponent, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRiskEvidenceSynthesis_Certainty} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRiskEvidenceSynthesis_Certainty
        && equalTo((ImmutableRiskEvidenceSynthesis_Certainty) another);
  }

  private boolean equalTo(ImmutableRiskEvidenceSynthesis_Certainty another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(rating, another.rating)
        && Objects.equals(certaintySubcomponent, another.certaintySubcomponent)
        && Objects.equals(note, another.note);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code id}, {@code extension}, {@code rating}, {@code certaintySubcomponent}, {@code note}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(rating);
    h += (h << 5) + Objects.hashCode(certaintySubcomponent);
    h += (h << 5) + Objects.hashCode(note);
    return h;
  }

  /**
   * Prints the immutable value {@code RiskEvidenceSynthesis_Certainty} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("RiskEvidenceSynthesis_Certainty{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (rating != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("rating=").append(rating);
    }
    if (certaintySubcomponent != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("certaintySubcomponent=").append(certaintySubcomponent);
    }
    if (note != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("note=").append(note);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "RiskEvidenceSynthesis_Certainty", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements RiskEvidenceSynthesis_Certainty {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<CodeableConcept>> rating = Optional.empty();
    boolean ratingIsSet;
    @Nullable Optional<List<RiskEvidenceSynthesis_CertaintySubcomponent>> certaintySubcomponent = Optional.empty();
    boolean certaintySubcomponentIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
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
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("rating")
    public void setRating(Optional<List<CodeableConcept>> rating) {
      this.rating = rating;
      this.ratingIsSet = true;
    }
    @JsonProperty("certaintySubcomponent")
    public void setCertaintySubcomponent(Optional<List<RiskEvidenceSynthesis_CertaintySubcomponent>> certaintySubcomponent) {
      this.certaintySubcomponent = certaintySubcomponent;
      this.certaintySubcomponentIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> rating() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<RiskEvidenceSynthesis_CertaintySubcomponent>> certaintySubcomponent() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableRiskEvidenceSynthesis_Certainty fromJson(Json json) {
    ImmutableRiskEvidenceSynthesis_Certainty.Builder builder = ImmutableRiskEvidenceSynthesis_Certainty.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.ratingIsSet) {
      builder.rating(json.rating);
    }
    if (json.certaintySubcomponentIsSet) {
      builder.certaintySubcomponent(json.certaintySubcomponent);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    return (ImmutableRiskEvidenceSynthesis_Certainty) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link RiskEvidenceSynthesis_Certainty} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RiskEvidenceSynthesis_Certainty instance
   */
  public static RiskEvidenceSynthesis_Certainty copyOf(RiskEvidenceSynthesis_Certainty instance) {
    if (instance instanceof ImmutableRiskEvidenceSynthesis_Certainty) {
      return (ImmutableRiskEvidenceSynthesis_Certainty) instance;
    }
    return ImmutableRiskEvidenceSynthesis_Certainty.builder()
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .extension(instance.extension())
        .rating(instance.rating())
        .certaintySubcomponent(instance.certaintySubcomponent())
        .note(instance.note())
        .build();
  }

  /**
   * Creates a builder for {@link RiskEvidenceSynthesis_Certainty RiskEvidenceSynthesis_Certainty}.
   * <pre>
   * ImmutableRiskEvidenceSynthesis_Certainty.builder()
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link RiskEvidenceSynthesis_Certainty#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link RiskEvidenceSynthesis_Certainty#id() id}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link RiskEvidenceSynthesis_Certainty#extension() extension}
   *    .rating(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link RiskEvidenceSynthesis_Certainty#rating() rating}
   *    .certaintySubcomponent(List&amp;lt;com.medplum.types.fhir.RiskEvidenceSynthesis_CertaintySubcomponent&amp;gt;) // optional {@link RiskEvidenceSynthesis_Certainty#certaintySubcomponent() certaintySubcomponent}
   *    .note(List&amp;lt;com.medplum.types.fhir.Annotation&amp;gt;) // optional {@link RiskEvidenceSynthesis_Certainty#note() note}
   *    .build();
   * </pre>
   * @return A new RiskEvidenceSynthesis_Certainty builder
   */
  public static ImmutableRiskEvidenceSynthesis_Certainty.Builder builder() {
    return new ImmutableRiskEvidenceSynthesis_Certainty.Builder();
  }

  /**
   * Builds instances of type {@link RiskEvidenceSynthesis_Certainty RiskEvidenceSynthesis_Certainty}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "RiskEvidenceSynthesis_Certainty", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_RATING = 0x8L;
    private static final long OPT_BIT_CERTAINTY_SUBCOMPONENT = 0x10L;
    private static final long OPT_BIT_NOTE = 0x20L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable List<CodeableConcept> rating;
    private @Nullable List<RiskEvidenceSynthesis_CertaintySubcomponent> certaintySubcomponent;
    private @Nullable List<Annotation> note;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis_Certainty#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_Certainty#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_Certainty#id() id} to id.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_Certainty#id() id} to id.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_Certainty#extension() extension} to extension.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_Certainty#extension() extension} to extension.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_Certainty#rating() rating} to rating.
     * @param rating The value for rating
     * @return {@code this} builder for chained invocation
     */
    public final Builder rating(List<CodeableConcept> rating) {
      checkNotIsSet(ratingIsSet(), "rating");
      this.rating = Objects.requireNonNull(rating, "rating");
      optBits |= OPT_BIT_RATING;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis_Certainty#rating() rating} to rating.
     * @param rating The value for rating
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("rating")
    public final Builder rating(Optional<? extends List<CodeableConcept>> rating) {
      checkNotIsSet(ratingIsSet(), "rating");
      this.rating = rating.orElse(null);
      optBits |= OPT_BIT_RATING;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis_Certainty#certaintySubcomponent() certaintySubcomponent} to certaintySubcomponent.
     * @param certaintySubcomponent The value for certaintySubcomponent
     * @return {@code this} builder for chained invocation
     */
    public final Builder certaintySubcomponent(List<RiskEvidenceSynthesis_CertaintySubcomponent> certaintySubcomponent) {
      checkNotIsSet(certaintySubcomponentIsSet(), "certaintySubcomponent");
      this.certaintySubcomponent = Objects.requireNonNull(certaintySubcomponent, "certaintySubcomponent");
      optBits |= OPT_BIT_CERTAINTY_SUBCOMPONENT;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis_Certainty#certaintySubcomponent() certaintySubcomponent} to certaintySubcomponent.
     * @param certaintySubcomponent The value for certaintySubcomponent
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("certaintySubcomponent")
    public final Builder certaintySubcomponent(Optional<? extends List<RiskEvidenceSynthesis_CertaintySubcomponent>> certaintySubcomponent) {
      checkNotIsSet(certaintySubcomponentIsSet(), "certaintySubcomponent");
      this.certaintySubcomponent = certaintySubcomponent.orElse(null);
      optBits |= OPT_BIT_CERTAINTY_SUBCOMPONENT;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis_Certainty#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    public final Builder note(List<Annotation> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = Objects.requireNonNull(note, "note");
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis_Certainty#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("note")
    public final Builder note(Optional<? extends List<Annotation>> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = note.orElse(null);
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Builds a new {@link RiskEvidenceSynthesis_Certainty RiskEvidenceSynthesis_Certainty}.
     * @return An immutable instance of RiskEvidenceSynthesis_Certainty
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public RiskEvidenceSynthesis_Certainty build() {
      return new ImmutableRiskEvidenceSynthesis_Certainty(modifierExtension, id, extension, rating, certaintySubcomponent, note);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean ratingIsSet() {
      return (optBits & OPT_BIT_RATING) != 0;
    }

    private boolean certaintySubcomponentIsSet() {
      return (optBits & OPT_BIT_CERTAINTY_SUBCOMPONENT) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of RiskEvidenceSynthesis_Certainty is strict, attribute is already set: ".concat(name));
    }
  }
}
