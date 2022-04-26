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
 * Immutable implementation of {@link ExplanationOfBenefit_ProcessNote}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExplanationOfBenefit_ProcessNote.builder()}.
 */
@Generated(from = "ExplanationOfBenefit_ProcessNote", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExplanationOfBenefit_ProcessNote
    implements ExplanationOfBenefit_ProcessNote {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final @Nullable PositiveInt number;
  private final @Nullable String text;
  private final @Nullable Explanationofbenefit_processnoteType type;
  private final @Nullable List<Extension> extension;
  private final @Nullable CodeableConcept language;

  private ImmutableExplanationOfBenefit_ProcessNote(
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      @Nullable PositiveInt number,
      @Nullable String text,
      @Nullable Explanationofbenefit_processnoteType type,
      @Nullable List<Extension> extension,
      @Nullable CodeableConcept language) {
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.number = number;
    this.text = text;
    this.type = type;
    this.extension = extension;
    this.language = language;
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
   * @return The value of the {@code number} attribute
   */
  @JsonProperty("number")
  @Override
  public Optional<PositiveInt> number() {
    return Optional.ofNullable(number);
  }

  /**
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<String> text() {
    return Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<Explanationofbenefit_processnoteType> type() {
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<CodeableConcept> language() {
    return Optional.ofNullable(language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_ProcessNote#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_ProcessNote withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableExplanationOfBenefit_ProcessNote(newValue, this.id, this.number, this.text, this.type, this.extension, this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_ProcessNote#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_ProcessNote withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableExplanationOfBenefit_ProcessNote(value, this.id, this.number, this.text, this.type, this.extension, this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_ProcessNote#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_ProcessNote withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableExplanationOfBenefit_ProcessNote(
        this.modifierExtension,
        newValue,
        this.number,
        this.text,
        this.type,
        this.extension,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_ProcessNote#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_ProcessNote withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableExplanationOfBenefit_ProcessNote(this.modifierExtension, value, this.number, this.text, this.type, this.extension, this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_ProcessNote#number() number} attribute.
   * @param value The value for number
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_ProcessNote withNumber(PositiveInt value) {
    @Nullable PositiveInt newValue = Objects.requireNonNull(value, "number");
    if (this.number == newValue) return this;
    return new ImmutableExplanationOfBenefit_ProcessNote(this.modifierExtension, this.id, newValue, this.text, this.type, this.extension, this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_ProcessNote#number() number} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for number
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_ProcessNote withNumber(Optional<? extends PositiveInt> optional) {
    @Nullable PositiveInt value = optional.orElse(null);
    if (this.number == value) return this;
    return new ImmutableExplanationOfBenefit_ProcessNote(this.modifierExtension, this.id, value, this.text, this.type, this.extension, this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_ProcessNote#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_ProcessNote withText(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "text");
    if (Objects.equals(this.text, newValue)) return this;
    return new ImmutableExplanationOfBenefit_ProcessNote(
        this.modifierExtension,
        this.id,
        this.number,
        newValue,
        this.type,
        this.extension,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_ProcessNote#text() text} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_ProcessNote withText(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.text, value)) return this;
    return new ImmutableExplanationOfBenefit_ProcessNote(this.modifierExtension, this.id, this.number, value, this.type, this.extension, this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_ProcessNote#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_ProcessNote withType(Explanationofbenefit_processnoteType value) {
    @Nullable Explanationofbenefit_processnoteType newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableExplanationOfBenefit_ProcessNote(
        this.modifierExtension,
        this.id,
        this.number,
        this.text,
        newValue,
        this.extension,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_ProcessNote#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_ProcessNote withType(Optional<? extends Explanationofbenefit_processnoteType> optional) {
    @Nullable Explanationofbenefit_processnoteType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableExplanationOfBenefit_ProcessNote(this.modifierExtension, this.id, this.number, this.text, value, this.extension, this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_ProcessNote#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_ProcessNote withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExplanationOfBenefit_ProcessNote(this.modifierExtension, this.id, this.number, this.text, this.type, newValue, this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_ProcessNote#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_ProcessNote withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExplanationOfBenefit_ProcessNote(this.modifierExtension, this.id, this.number, this.text, this.type, value, this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_ProcessNote#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_ProcessNote withLanguage(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableExplanationOfBenefit_ProcessNote(this.modifierExtension, this.id, this.number, this.text, this.type, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_ProcessNote#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_ProcessNote withLanguage(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableExplanationOfBenefit_ProcessNote(this.modifierExtension, this.id, this.number, this.text, this.type, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExplanationOfBenefit_ProcessNote} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExplanationOfBenefit_ProcessNote
        && equalTo((ImmutableExplanationOfBenefit_ProcessNote) another);
  }

  private boolean equalTo(ImmutableExplanationOfBenefit_ProcessNote another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(number, another.number)
        && Objects.equals(text, another.text)
        && Objects.equals(type, another.type)
        && Objects.equals(extension, another.extension)
        && Objects.equals(language, another.language);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code id}, {@code number}, {@code text}, {@code type}, {@code extension}, {@code language}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(number);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(language);
    return h;
  }

  /**
   * Prints the immutable value {@code ExplanationOfBenefit_ProcessNote} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ExplanationOfBenefit_ProcessNote{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (number != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("number=").append(number);
    }
    if (text != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (type != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (extension != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (language != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("language=").append(language);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ExplanationOfBenefit_ProcessNote", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ExplanationOfBenefit_ProcessNote {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<PositiveInt> number = Optional.empty();
    boolean numberIsSet;
    @Nullable Optional<String> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Explanationofbenefit_processnoteType> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<CodeableConcept> language = Optional.empty();
    boolean languageIsSet;
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
    @JsonProperty("number")
    public void setNumber(Optional<PositiveInt> number) {
      this.number = number;
      this.numberIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<String> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<Explanationofbenefit_processnoteType> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<CodeableConcept> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<PositiveInt> number() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Explanationofbenefit_processnoteType> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> language() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableExplanationOfBenefit_ProcessNote fromJson(Json json) {
    ImmutableExplanationOfBenefit_ProcessNote.Builder builder = ImmutableExplanationOfBenefit_ProcessNote.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.numberIsSet) {
      builder.number(json.number);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    return (ImmutableExplanationOfBenefit_ProcessNote) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ExplanationOfBenefit_ProcessNote} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ExplanationOfBenefit_ProcessNote instance
   */
  public static ExplanationOfBenefit_ProcessNote copyOf(ExplanationOfBenefit_ProcessNote instance) {
    if (instance instanceof ImmutableExplanationOfBenefit_ProcessNote) {
      return (ImmutableExplanationOfBenefit_ProcessNote) instance;
    }
    return ImmutableExplanationOfBenefit_ProcessNote.builder()
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .number(instance.number())
        .text(instance.text())
        .type(instance.type())
        .extension(instance.extension())
        .language(instance.language())
        .build();
  }

  /**
   * Creates a builder for {@link ExplanationOfBenefit_ProcessNote ExplanationOfBenefit_ProcessNote}.
   * <pre>
   * ImmutableExplanationOfBenefit_ProcessNote.builder()
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_ProcessNote#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link ExplanationOfBenefit_ProcessNote#id() id}
   *    .number(com.medplum.types.fhir.PositiveInt) // optional {@link ExplanationOfBenefit_ProcessNote#number() number}
   *    .text(String) // optional {@link ExplanationOfBenefit_ProcessNote#text() text}
   *    .type(com.medplum.types.fhir.Explanationofbenefit_processnoteType) // optional {@link ExplanationOfBenefit_ProcessNote#type() type}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_ProcessNote#extension() extension}
   *    .language(com.medplum.types.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit_ProcessNote#language() language}
   *    .build();
   * </pre>
   * @return A new ExplanationOfBenefit_ProcessNote builder
   */
  public static ImmutableExplanationOfBenefit_ProcessNote.Builder builder() {
    return new ImmutableExplanationOfBenefit_ProcessNote.Builder();
  }

  /**
   * Builds instances of type {@link ExplanationOfBenefit_ProcessNote ExplanationOfBenefit_ProcessNote}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ExplanationOfBenefit_ProcessNote", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_NUMBER = 0x4L;
    private static final long OPT_BIT_TEXT = 0x8L;
    private static final long OPT_BIT_TYPE = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_LANGUAGE = 0x40L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable PositiveInt number;
    private @Nullable String text;
    private @Nullable Explanationofbenefit_processnoteType type;
    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept language;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_ProcessNote#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_ProcessNote#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_ProcessNote#id() id} to id.
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
     * Initializes the optional value {@link ExplanationOfBenefit_ProcessNote#id() id} to id.
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
     * Initializes the optional value {@link ExplanationOfBenefit_ProcessNote#number() number} to number.
     * @param number The value for number
     * @return {@code this} builder for chained invocation
     */
    public final Builder number(PositiveInt number) {
      checkNotIsSet(numberIsSet(), "number");
      this.number = Objects.requireNonNull(number, "number");
      optBits |= OPT_BIT_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_ProcessNote#number() number} to number.
     * @param number The value for number
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("number")
    public final Builder number(Optional<? extends PositiveInt> number) {
      checkNotIsSet(numberIsSet(), "number");
      this.number = number.orElse(null);
      optBits |= OPT_BIT_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_ProcessNote#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    public final Builder text(String text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = Objects.requireNonNull(text, "text");
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_ProcessNote#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("text")
    public final Builder text(Optional<String> text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = text.orElse(null);
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_ProcessNote#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(Explanationofbenefit_processnoteType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_ProcessNote#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends Explanationofbenefit_processnoteType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_ProcessNote#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_ProcessNote#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_ProcessNote#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(CodeableConcept language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_ProcessNote#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("language")
    public final Builder language(Optional<? extends CodeableConcept> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Builds a new {@link ExplanationOfBenefit_ProcessNote ExplanationOfBenefit_ProcessNote}.
     * @return An immutable instance of ExplanationOfBenefit_ProcessNote
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ExplanationOfBenefit_ProcessNote build() {
      return new ImmutableExplanationOfBenefit_ProcessNote(modifierExtension, id, number, text, type, extension, language);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean numberIsSet() {
      return (optBits & OPT_BIT_NUMBER) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ExplanationOfBenefit_ProcessNote is strict, attribute is already set: ".concat(name));
    }
  }
}
