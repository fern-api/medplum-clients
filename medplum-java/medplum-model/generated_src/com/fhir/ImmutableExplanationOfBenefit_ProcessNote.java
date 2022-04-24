//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ExplanationOfBenefit_ProcessNote}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExplanationOfBenefit_ProcessNote.builder()}.
 */
@org.immutables.value.Generated(from = "ExplanationOfBenefit_ProcessNote", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExplanationOfBenefit_ProcessNote
    implements com.fhir.ExplanationOfBenefit_ProcessNote {
  private final @javax.annotation.Nullable com.fhir.Explanationofbenefit_processnoteType type;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.positiveInt number;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.lang.String text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept language;

  private ImmutableExplanationOfBenefit_ProcessNote(
      @javax.annotation.Nullable com.fhir.Explanationofbenefit_processnoteType type,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.positiveInt number,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.lang.String text,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.CodeableConcept language) {
    this.type = type;
    this.modifierExtension = modifierExtension;
    this.number = number;
    this.id = id;
    this.text = text;
    this.extension = extension;
    this.language = language;
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.Explanationofbenefit_processnoteType> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code number} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("number")
  @Override
  public java.util.Optional<com.fhir.positiveInt> number() {
    return java.util.Optional.ofNullable(number);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<java.lang.String> text() {
    return java.util.Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> language() {
    return java.util.Optional.ofNullable(language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_ProcessNote#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_ProcessNote withType(com.fhir.Explanationofbenefit_processnoteType value) {
    @javax.annotation.Nullable com.fhir.Explanationofbenefit_processnoteType newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableExplanationOfBenefit_ProcessNote(
        newValue,
        this.modifierExtension,
        this.number,
        this.id,
        this.text,
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
  public final ImmutableExplanationOfBenefit_ProcessNote withType(java.util.Optional<? extends com.fhir.Explanationofbenefit_processnoteType> optional) {
    @javax.annotation.Nullable com.fhir.Explanationofbenefit_processnoteType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableExplanationOfBenefit_ProcessNote(value, this.modifierExtension, this.number, this.id, this.text, this.extension, this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_ProcessNote#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_ProcessNote withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableExplanationOfBenefit_ProcessNote(this.type, newValue, this.number, this.id, this.text, this.extension, this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_ProcessNote#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_ProcessNote withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableExplanationOfBenefit_ProcessNote(this.type, value, this.number, this.id, this.text, this.extension, this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_ProcessNote#number() number} attribute.
   * @param value The value for number
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_ProcessNote withNumber(com.fhir.positiveInt value) {
    @javax.annotation.Nullable com.fhir.positiveInt newValue = java.util.Objects.requireNonNull(value, "number");
    if (this.number == newValue) return this;
    return new ImmutableExplanationOfBenefit_ProcessNote(this.type, this.modifierExtension, newValue, this.id, this.text, this.extension, this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_ProcessNote#number() number} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for number
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_ProcessNote withNumber(java.util.Optional<? extends com.fhir.positiveInt> optional) {
    @javax.annotation.Nullable com.fhir.positiveInt value = optional.orElse(null);
    if (this.number == value) return this;
    return new ImmutableExplanationOfBenefit_ProcessNote(this.type, this.modifierExtension, value, this.id, this.text, this.extension, this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_ProcessNote#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_ProcessNote withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableExplanationOfBenefit_ProcessNote(
        this.type,
        this.modifierExtension,
        this.number,
        newValue,
        this.text,
        this.extension,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_ProcessNote#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_ProcessNote withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableExplanationOfBenefit_ProcessNote(this.type, this.modifierExtension, this.number, value, this.text, this.extension, this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_ProcessNote#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_ProcessNote withText(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "text");
    if (java.util.Objects.equals(this.text, newValue)) return this;
    return new ImmutableExplanationOfBenefit_ProcessNote(
        this.type,
        this.modifierExtension,
        this.number,
        this.id,
        newValue,
        this.extension,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_ProcessNote#text() text} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_ProcessNote withText(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.text, value)) return this;
    return new ImmutableExplanationOfBenefit_ProcessNote(this.type, this.modifierExtension, this.number, this.id, value, this.extension, this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_ProcessNote#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_ProcessNote withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExplanationOfBenefit_ProcessNote(this.type, this.modifierExtension, this.number, this.id, this.text, newValue, this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_ProcessNote#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_ProcessNote withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExplanationOfBenefit_ProcessNote(this.type, this.modifierExtension, this.number, this.id, this.text, value, this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_ProcessNote#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_ProcessNote withLanguage(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableExplanationOfBenefit_ProcessNote(this.type, this.modifierExtension, this.number, this.id, this.text, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_ProcessNote#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_ProcessNote withLanguage(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableExplanationOfBenefit_ProcessNote(this.type, this.modifierExtension, this.number, this.id, this.text, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExplanationOfBenefit_ProcessNote} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExplanationOfBenefit_ProcessNote
        && equalTo((ImmutableExplanationOfBenefit_ProcessNote) another);
  }

  private boolean equalTo(ImmutableExplanationOfBenefit_ProcessNote another) {
    return java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(number, another.number)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(language, another.language);
  }

  /**
   * Computes a hash code from attributes: {@code type}, {@code modifierExtension}, {@code number}, {@code id}, {@code text}, {@code extension}, {@code language}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(number);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(language);
    return h;
  }

  /**
   * Prints the immutable value {@code ExplanationOfBenefit_ProcessNote} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ExplanationOfBenefit_ProcessNote{");
    if (type != null) {
      builder.append("type=").append(type);
    }
    if (modifierExtension != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (number != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("number=").append(number);
    }
    if (id != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (text != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("text=").append(text);
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
  @org.immutables.value.Generated(from = "ExplanationOfBenefit_ProcessNote", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ExplanationOfBenefit_ProcessNote {
    @javax.annotation.Nullable java.util.Optional<com.fhir.Explanationofbenefit_processnoteType> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.positiveInt> number = java.util.Optional.empty();
    boolean numberIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> language = java.util.Optional.empty();
    boolean languageIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.Explanationofbenefit_processnoteType> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("number")
    public void setNumber(java.util.Optional<com.fhir.positiveInt> number) {
      this.number = number;
      this.numberIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<java.lang.String> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.CodeableConcept> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.Explanationofbenefit_processnoteType> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.positiveInt> number() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> language() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableExplanationOfBenefit_ProcessNote fromJson(Json json) {
    ImmutableExplanationOfBenefit_ProcessNote.Builder builder = ImmutableExplanationOfBenefit_ProcessNote.builder();
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.numberIsSet) {
      builder.number(json.number);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.textIsSet) {
      builder.text(json.text);
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
        .type(instance.type())
        .modifierExtension(instance.modifierExtension())
        .number(instance.number())
        .id(instance.id())
        .text(instance.text())
        .extension(instance.extension())
        .language(instance.language())
        .build();
  }

  /**
   * Creates a builder for {@link ExplanationOfBenefit_ProcessNote ExplanationOfBenefit_ProcessNote}.
   * <pre>
   * ImmutableExplanationOfBenefit_ProcessNote.builder()
   *    .type(com.fhir.Explanationofbenefit_processnoteType) // optional {@link ExplanationOfBenefit_ProcessNote#type() type}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_ProcessNote#modifierExtension() modifierExtension}
   *    .number(com.fhir.positiveInt) // optional {@link ExplanationOfBenefit_ProcessNote#number() number}
   *    .id(String) // optional {@link ExplanationOfBenefit_ProcessNote#id() id}
   *    .text(String) // optional {@link ExplanationOfBenefit_ProcessNote#text() text}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_ProcessNote#extension() extension}
   *    .language(com.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit_ProcessNote#language() language}
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
  @org.immutables.value.Generated(from = "ExplanationOfBenefit_ProcessNote", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_TYPE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_NUMBER = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_TEXT = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_LANGUAGE = 0x40L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.Explanationofbenefit_processnoteType type;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.positiveInt number;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.lang.String text;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.CodeableConcept language;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_ProcessNote#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.Explanationofbenefit_processnoteType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_ProcessNote#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.Explanationofbenefit_processnoteType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_ProcessNote#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(java.util.List<com.fhir.Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = java.util.Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_ProcessNote#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public final Builder modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_ProcessNote#number() number} to number.
     * @param number The value for number
     * @return {@code this} builder for chained invocation
     */
    public final Builder number(com.fhir.positiveInt number) {
      checkNotIsSet(numberIsSet(), "number");
      this.number = java.util.Objects.requireNonNull(number, "number");
      optBits |= OPT_BIT_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_ProcessNote#number() number} to number.
     * @param number The value for number
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("number")
    public final Builder number(java.util.Optional<? extends com.fhir.positiveInt> number) {
      checkNotIsSet(numberIsSet(), "number");
      this.number = number.orElse(null);
      optBits |= OPT_BIT_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_ProcessNote#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(java.lang.String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_ProcessNote#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<java.lang.String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_ProcessNote#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    public final Builder text(java.lang.String text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = java.util.Objects.requireNonNull(text, "text");
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_ProcessNote#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public final Builder text(java.util.Optional<java.lang.String> text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = text.orElse(null);
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_ProcessNote#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(java.util.List<com.fhir.Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = java.util.Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_ProcessNote#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public final Builder extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension) {
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
    public final Builder language(com.fhir.CodeableConcept language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = java.util.Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_ProcessNote#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public final Builder language(java.util.Optional<? extends com.fhir.CodeableConcept> language) {
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
    public com.fhir.ExplanationOfBenefit_ProcessNote build() {
      return new ImmutableExplanationOfBenefit_ProcessNote(type, modifierExtension, number, id, text, extension, language);
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean numberIsSet() {
      return (optBits & OPT_BIT_NUMBER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ExplanationOfBenefit_ProcessNote is strict, attribute is already set: ".concat(name));
    }
  }
}
