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
 * Immutable implementation of {@link EffectEvidenceSynthesis_CertaintySubcomponent}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEffectEvidenceSynthesis_CertaintySubcomponent.builder()}.
 */
@Generated(from = "EffectEvidenceSynthesis_CertaintySubcomponent", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableEffectEvidenceSynthesis_CertaintySubcomponent
    implements EffectEvidenceSynthesis_CertaintySubcomponent {
  private final @Nullable List<CodeableConcept> rating;
  private final @Nullable String id;
  private final @Nullable List<Annotation> note;
  private final @Nullable CodeableConcept type;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableEffectEvidenceSynthesis_CertaintySubcomponent(
      @Nullable List<CodeableConcept> rating,
      @Nullable String id,
      @Nullable List<Annotation> note,
      @Nullable CodeableConcept type,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension) {
    this.rating = rating;
    this.id = id;
    this.note = note;
    this.type = type;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<CodeableConcept> type() {
    return Optional.ofNullable(type);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis_CertaintySubcomponent#rating() rating} attribute.
   * @param value The value for rating
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_CertaintySubcomponent withRating(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "rating");
    if (this.rating == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis_CertaintySubcomponent(newValue, this.id, this.note, this.type, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis_CertaintySubcomponent#rating() rating} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for rating
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis_CertaintySubcomponent withRating(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.rating == value) return this;
    return new ImmutableEffectEvidenceSynthesis_CertaintySubcomponent(value, this.id, this.note, this.type, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis_CertaintySubcomponent#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_CertaintySubcomponent withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableEffectEvidenceSynthesis_CertaintySubcomponent(this.rating, newValue, this.note, this.type, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis_CertaintySubcomponent#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_CertaintySubcomponent withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableEffectEvidenceSynthesis_CertaintySubcomponent(this.rating, value, this.note, this.type, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis_CertaintySubcomponent#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_CertaintySubcomponent withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis_CertaintySubcomponent(this.rating, this.id, newValue, this.type, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis_CertaintySubcomponent#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis_CertaintySubcomponent withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableEffectEvidenceSynthesis_CertaintySubcomponent(this.rating, this.id, value, this.type, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis_CertaintySubcomponent#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_CertaintySubcomponent withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis_CertaintySubcomponent(this.rating, this.id, this.note, newValue, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis_CertaintySubcomponent#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis_CertaintySubcomponent withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableEffectEvidenceSynthesis_CertaintySubcomponent(this.rating, this.id, this.note, value, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis_CertaintySubcomponent#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_CertaintySubcomponent withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis_CertaintySubcomponent(this.rating, this.id, this.note, this.type, newValue, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis_CertaintySubcomponent#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis_CertaintySubcomponent withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableEffectEvidenceSynthesis_CertaintySubcomponent(this.rating, this.id, this.note, this.type, value, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis_CertaintySubcomponent#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_CertaintySubcomponent withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis_CertaintySubcomponent(this.rating, this.id, this.note, this.type, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis_CertaintySubcomponent#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis_CertaintySubcomponent withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableEffectEvidenceSynthesis_CertaintySubcomponent(this.rating, this.id, this.note, this.type, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEffectEvidenceSynthesis_CertaintySubcomponent} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEffectEvidenceSynthesis_CertaintySubcomponent
        && equalTo((ImmutableEffectEvidenceSynthesis_CertaintySubcomponent) another);
  }

  private boolean equalTo(ImmutableEffectEvidenceSynthesis_CertaintySubcomponent another) {
    return Objects.equals(rating, another.rating)
        && Objects.equals(id, another.id)
        && Objects.equals(note, another.note)
        && Objects.equals(type, another.type)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code rating}, {@code id}, {@code note}, {@code type}, {@code extension}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(rating);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code EffectEvidenceSynthesis_CertaintySubcomponent} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("EffectEvidenceSynthesis_CertaintySubcomponent{");
    if (rating != null) {
      builder.append("rating=").append(rating);
    }
    if (id != null) {
      if (builder.length() > 46) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (note != null) {
      if (builder.length() > 46) builder.append(", ");
      builder.append("note=").append(note);
    }
    if (type != null) {
      if (builder.length() > 46) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (extension != null) {
      if (builder.length() > 46) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 46) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "EffectEvidenceSynthesis_CertaintySubcomponent", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements EffectEvidenceSynthesis_CertaintySubcomponent {
    @Nullable Optional<List<CodeableConcept>> rating = Optional.empty();
    boolean ratingIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("rating")
    public void setRating(Optional<List<CodeableConcept>> rating) {
      this.rating = rating;
      this.ratingIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
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
    @Override
    public Optional<List<CodeableConcept>> rating() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
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
  static ImmutableEffectEvidenceSynthesis_CertaintySubcomponent fromJson(Json json) {
    ImmutableEffectEvidenceSynthesis_CertaintySubcomponent.Builder builder = ImmutableEffectEvidenceSynthesis_CertaintySubcomponent.builder();
    if (json.ratingIsSet) {
      builder.rating(json.rating);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableEffectEvidenceSynthesis_CertaintySubcomponent) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link EffectEvidenceSynthesis_CertaintySubcomponent} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EffectEvidenceSynthesis_CertaintySubcomponent instance
   */
  public static EffectEvidenceSynthesis_CertaintySubcomponent copyOf(EffectEvidenceSynthesis_CertaintySubcomponent instance) {
    if (instance instanceof ImmutableEffectEvidenceSynthesis_CertaintySubcomponent) {
      return (ImmutableEffectEvidenceSynthesis_CertaintySubcomponent) instance;
    }
    return ImmutableEffectEvidenceSynthesis_CertaintySubcomponent.builder()
        .rating(instance.rating())
        .id(instance.id())
        .note(instance.note())
        .type(instance.type())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link EffectEvidenceSynthesis_CertaintySubcomponent EffectEvidenceSynthesis_CertaintySubcomponent}.
   * <pre>
   * ImmutableEffectEvidenceSynthesis_CertaintySubcomponent.builder()
   *    .rating(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link EffectEvidenceSynthesis_CertaintySubcomponent#rating() rating}
   *    .id(String) // optional {@link EffectEvidenceSynthesis_CertaintySubcomponent#id() id}
   *    .note(List&amp;lt;com.fhir.types.fhir.Annotation&amp;gt;) // optional {@link EffectEvidenceSynthesis_CertaintySubcomponent#note() note}
   *    .type(com.fhir.types.fhir.CodeableConcept) // optional {@link EffectEvidenceSynthesis_CertaintySubcomponent#type() type}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link EffectEvidenceSynthesis_CertaintySubcomponent#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link EffectEvidenceSynthesis_CertaintySubcomponent#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new EffectEvidenceSynthesis_CertaintySubcomponent builder
   */
  public static ImmutableEffectEvidenceSynthesis_CertaintySubcomponent.Builder builder() {
    return new ImmutableEffectEvidenceSynthesis_CertaintySubcomponent.Builder();
  }

  /**
   * Builds instances of type {@link EffectEvidenceSynthesis_CertaintySubcomponent EffectEvidenceSynthesis_CertaintySubcomponent}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "EffectEvidenceSynthesis_CertaintySubcomponent", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_RATING = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_NOTE = 0x4L;
    private static final long OPT_BIT_TYPE = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private long optBits;

    private @Nullable List<CodeableConcept> rating;
    private @Nullable String id;
    private @Nullable List<Annotation> note;
    private @Nullable CodeableConcept type;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis_CertaintySubcomponent#rating() rating} to rating.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_CertaintySubcomponent#rating() rating} to rating.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_CertaintySubcomponent#id() id} to id.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_CertaintySubcomponent#id() id} to id.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_CertaintySubcomponent#note() note} to note.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_CertaintySubcomponent#note() note} to note.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_CertaintySubcomponent#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis_CertaintySubcomponent#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis_CertaintySubcomponent#extension() extension} to extension.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_CertaintySubcomponent#extension() extension} to extension.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_CertaintySubcomponent#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_CertaintySubcomponent#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link EffectEvidenceSynthesis_CertaintySubcomponent EffectEvidenceSynthesis_CertaintySubcomponent}.
     * @return An immutable instance of EffectEvidenceSynthesis_CertaintySubcomponent
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public EffectEvidenceSynthesis_CertaintySubcomponent build() {
      return new ImmutableEffectEvidenceSynthesis_CertaintySubcomponent(rating, id, note, type, extension, modifierExtension);
    }

    private boolean ratingIsSet() {
      return (optBits & OPT_BIT_RATING) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of EffectEvidenceSynthesis_CertaintySubcomponent is strict, attribute is already set: ".concat(name));
    }
  }
}
