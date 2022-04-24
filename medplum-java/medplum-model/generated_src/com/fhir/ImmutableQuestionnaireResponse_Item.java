//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link QuestionnaireResponse_Item}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableQuestionnaireResponse_Item.builder()}.
 */
@org.immutables.value.Generated(from = "QuestionnaireResponse_Item", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableQuestionnaireResponse_Item implements com.fhir.QuestionnaireResponse_Item {
  private final @javax.annotation.Nullable java.util.List<com.fhir.QuestionnaireResponse_Item> item;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.uri definition;
  private final @javax.annotation.Nullable java.util.List<com.fhir.QuestionnaireResponse_Answer> answer;
  private final @javax.annotation.Nullable java.lang.String linkId;
  private final @javax.annotation.Nullable java.lang.String text;

  private ImmutableQuestionnaireResponse_Item(
      @javax.annotation.Nullable java.util.List<com.fhir.QuestionnaireResponse_Item> item,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.uri definition,
      @javax.annotation.Nullable java.util.List<com.fhir.QuestionnaireResponse_Answer> answer,
      @javax.annotation.Nullable java.lang.String linkId,
      @javax.annotation.Nullable java.lang.String text) {
    this.item = item;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.extension = extension;
    this.definition = definition;
    this.answer = answer;
    this.linkId = linkId;
    this.text = text;
  }

  /**
   * @return The value of the {@code item} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("item")
  @Override
  public java.util.Optional<java.util.List<com.fhir.QuestionnaireResponse_Item>> item() {
    return java.util.Optional.ofNullable(item);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
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
   * @return The value of the {@code definition} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("definition")
  @Override
  public java.util.Optional<com.fhir.uri> definition() {
    return java.util.Optional.ofNullable(definition);
  }

  /**
   * @return The value of the {@code answer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("answer")
  @Override
  public java.util.Optional<java.util.List<com.fhir.QuestionnaireResponse_Answer>> answer() {
    return java.util.Optional.ofNullable(answer);
  }

  /**
   * @return The value of the {@code linkId} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("linkId")
  @Override
  public java.util.Optional<java.lang.String> linkId() {
    return java.util.Optional.ofNullable(linkId);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse_Item#item() item} attribute.
   * @param value The value for item
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Item withItem(java.util.List<com.fhir.QuestionnaireResponse_Item> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.QuestionnaireResponse_Item> newValue = java.util.Objects.requireNonNull(value, "item");
    if (this.item == newValue) return this;
    return new ImmutableQuestionnaireResponse_Item(
        newValue,
        this.modifierExtension,
        this.id,
        this.extension,
        this.definition,
        this.answer,
        this.linkId,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse_Item#item() item} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for item
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse_Item withItem(java.util.Optional<? extends java.util.List<com.fhir.QuestionnaireResponse_Item>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.QuestionnaireResponse_Item> value = optional.orElse(null);
    if (this.item == value) return this;
    return new ImmutableQuestionnaireResponse_Item(
        value,
        this.modifierExtension,
        this.id,
        this.extension,
        this.definition,
        this.answer,
        this.linkId,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse_Item#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Item withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableQuestionnaireResponse_Item(
        this.item,
        newValue,
        this.id,
        this.extension,
        this.definition,
        this.answer,
        this.linkId,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse_Item#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse_Item withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableQuestionnaireResponse_Item(this.item, value, this.id, this.extension, this.definition, this.answer, this.linkId, this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse_Item#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Item withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableQuestionnaireResponse_Item(
        this.item,
        this.modifierExtension,
        newValue,
        this.extension,
        this.definition,
        this.answer,
        this.linkId,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse_Item#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Item withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableQuestionnaireResponse_Item(
        this.item,
        this.modifierExtension,
        value,
        this.extension,
        this.definition,
        this.answer,
        this.linkId,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse_Item#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Item withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableQuestionnaireResponse_Item(
        this.item,
        this.modifierExtension,
        this.id,
        newValue,
        this.definition,
        this.answer,
        this.linkId,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse_Item#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse_Item withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableQuestionnaireResponse_Item(
        this.item,
        this.modifierExtension,
        this.id,
        value,
        this.definition,
        this.answer,
        this.linkId,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse_Item#definition() definition} attribute.
   * @param value The value for definition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Item withDefinition(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "definition");
    if (this.definition == newValue) return this;
    return new ImmutableQuestionnaireResponse_Item(
        this.item,
        this.modifierExtension,
        this.id,
        this.extension,
        newValue,
        this.answer,
        this.linkId,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse_Item#definition() definition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for definition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse_Item withDefinition(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.definition == value) return this;
    return new ImmutableQuestionnaireResponse_Item(
        this.item,
        this.modifierExtension,
        this.id,
        this.extension,
        value,
        this.answer,
        this.linkId,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse_Item#answer() answer} attribute.
   * @param value The value for answer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Item withAnswer(java.util.List<com.fhir.QuestionnaireResponse_Answer> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.QuestionnaireResponse_Answer> newValue = java.util.Objects.requireNonNull(value, "answer");
    if (this.answer == newValue) return this;
    return new ImmutableQuestionnaireResponse_Item(
        this.item,
        this.modifierExtension,
        this.id,
        this.extension,
        this.definition,
        newValue,
        this.linkId,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse_Item#answer() answer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for answer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse_Item withAnswer(java.util.Optional<? extends java.util.List<com.fhir.QuestionnaireResponse_Answer>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.QuestionnaireResponse_Answer> value = optional.orElse(null);
    if (this.answer == value) return this;
    return new ImmutableQuestionnaireResponse_Item(
        this.item,
        this.modifierExtension,
        this.id,
        this.extension,
        this.definition,
        value,
        this.linkId,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse_Item#linkId() linkId} attribute.
   * @param value The value for linkId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Item withLinkId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "linkId");
    if (java.util.Objects.equals(this.linkId, newValue)) return this;
    return new ImmutableQuestionnaireResponse_Item(
        this.item,
        this.modifierExtension,
        this.id,
        this.extension,
        this.definition,
        this.answer,
        newValue,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse_Item#linkId() linkId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for linkId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Item withLinkId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.linkId, value)) return this;
    return new ImmutableQuestionnaireResponse_Item(
        this.item,
        this.modifierExtension,
        this.id,
        this.extension,
        this.definition,
        this.answer,
        value,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse_Item#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Item withText(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "text");
    if (java.util.Objects.equals(this.text, newValue)) return this;
    return new ImmutableQuestionnaireResponse_Item(
        this.item,
        this.modifierExtension,
        this.id,
        this.extension,
        this.definition,
        this.answer,
        this.linkId,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse_Item#text() text} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Item withText(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.text, value)) return this;
    return new ImmutableQuestionnaireResponse_Item(
        this.item,
        this.modifierExtension,
        this.id,
        this.extension,
        this.definition,
        this.answer,
        this.linkId,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableQuestionnaireResponse_Item} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableQuestionnaireResponse_Item
        && equalTo((ImmutableQuestionnaireResponse_Item) another);
  }

  private boolean equalTo(ImmutableQuestionnaireResponse_Item another) {
    return java.util.Objects.equals(item, another.item)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(definition, another.definition)
        && java.util.Objects.equals(answer, another.answer)
        && java.util.Objects.equals(linkId, another.linkId)
        && java.util.Objects.equals(text, another.text);
  }

  /**
   * Computes a hash code from attributes: {@code item}, {@code modifierExtension}, {@code id}, {@code extension}, {@code definition}, {@code answer}, {@code linkId}, {@code text}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(item);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(definition);
    h += (h << 5) + java.util.Objects.hashCode(answer);
    h += (h << 5) + java.util.Objects.hashCode(linkId);
    h += (h << 5) + java.util.Objects.hashCode(text);
    return h;
  }

  /**
   * Prints the immutable value {@code QuestionnaireResponse_Item} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("QuestionnaireResponse_Item{");
    if (item != null) {
      builder.append("item=").append(item);
    }
    if (modifierExtension != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (definition != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("definition=").append(definition);
    }
    if (answer != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("answer=").append(answer);
    }
    if (linkId != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("linkId=").append(linkId);
    }
    if (text != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("text=").append(text);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "QuestionnaireResponse_Item", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.QuestionnaireResponse_Item {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.QuestionnaireResponse_Item>> item = java.util.Optional.empty();
    boolean itemIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> definition = java.util.Optional.empty();
    boolean definitionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.QuestionnaireResponse_Answer>> answer = java.util.Optional.empty();
    boolean answerIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> linkId = java.util.Optional.empty();
    boolean linkIdIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> text = java.util.Optional.empty();
    boolean textIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("item")
    public void setItem(java.util.Optional<java.util.List<com.fhir.QuestionnaireResponse_Item>> item) {
      this.item = item;
      this.itemIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("definition")
    public void setDefinition(java.util.Optional<com.fhir.uri> definition) {
      this.definition = definition;
      this.definitionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("answer")
    public void setAnswer(java.util.Optional<java.util.List<com.fhir.QuestionnaireResponse_Answer>> answer) {
      this.answer = answer;
      this.answerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("linkId")
    public void setLinkId(java.util.Optional<java.lang.String> linkId) {
      this.linkId = linkId;
      this.linkIdIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<java.lang.String> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.QuestionnaireResponse_Item>> item() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> definition() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.QuestionnaireResponse_Answer>> answer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> linkId() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> text() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableQuestionnaireResponse_Item fromJson(Json json) {
    ImmutableQuestionnaireResponse_Item.Builder builder = ImmutableQuestionnaireResponse_Item.builder();
    if (json.itemIsSet) {
      builder.item(json.item);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.definitionIsSet) {
      builder.definition(json.definition);
    }
    if (json.answerIsSet) {
      builder.answer(json.answer);
    }
    if (json.linkIdIsSet) {
      builder.linkId(json.linkId);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    return (ImmutableQuestionnaireResponse_Item) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link QuestionnaireResponse_Item} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable QuestionnaireResponse_Item instance
   */
  public static QuestionnaireResponse_Item copyOf(QuestionnaireResponse_Item instance) {
    if (instance instanceof ImmutableQuestionnaireResponse_Item) {
      return (ImmutableQuestionnaireResponse_Item) instance;
    }
    return ImmutableQuestionnaireResponse_Item.builder()
        .item(instance.item())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .extension(instance.extension())
        .definition(instance.definition())
        .answer(instance.answer())
        .linkId(instance.linkId())
        .text(instance.text())
        .build();
  }

  /**
   * Creates a builder for {@link QuestionnaireResponse_Item QuestionnaireResponse_Item}.
   * <pre>
   * ImmutableQuestionnaireResponse_Item.builder()
   *    .item(List&amp;lt;com.fhir.QuestionnaireResponse_Item&amp;gt;) // optional {@link QuestionnaireResponse_Item#item() item}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link QuestionnaireResponse_Item#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link QuestionnaireResponse_Item#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link QuestionnaireResponse_Item#extension() extension}
   *    .definition(com.fhir.uri) // optional {@link QuestionnaireResponse_Item#definition() definition}
   *    .answer(List&amp;lt;com.fhir.QuestionnaireResponse_Answer&amp;gt;) // optional {@link QuestionnaireResponse_Item#answer() answer}
   *    .linkId(String) // optional {@link QuestionnaireResponse_Item#linkId() linkId}
   *    .text(String) // optional {@link QuestionnaireResponse_Item#text() text}
   *    .build();
   * </pre>
   * @return A new QuestionnaireResponse_Item builder
   */
  public static ImmutableQuestionnaireResponse_Item.Builder builder() {
    return new ImmutableQuestionnaireResponse_Item.Builder();
  }

  /**
   * Builds instances of type {@link QuestionnaireResponse_Item QuestionnaireResponse_Item}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "QuestionnaireResponse_Item", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ITEM = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_DEFINITION = 0x10L;
    private static final long OPT_BIT_ANSWER = 0x20L;
    private static final long OPT_BIT_LINK_ID = 0x40L;
    private static final long OPT_BIT_TEXT = 0x80L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.QuestionnaireResponse_Item> item;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.uri definition;
    private @javax.annotation.Nullable java.util.List<com.fhir.QuestionnaireResponse_Answer> answer;
    private @javax.annotation.Nullable java.lang.String linkId;
    private @javax.annotation.Nullable java.lang.String text;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse_Item#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for chained invocation
     */
    public final Builder item(java.util.List<com.fhir.QuestionnaireResponse_Item> item) {
      checkNotIsSet(itemIsSet(), "item");
      this.item = java.util.Objects.requireNonNull(item, "item");
      optBits |= OPT_BIT_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse_Item#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("item")
    public final Builder item(java.util.Optional<? extends java.util.List<com.fhir.QuestionnaireResponse_Item>> item) {
      checkNotIsSet(itemIsSet(), "item");
      this.item = item.orElse(null);
      optBits |= OPT_BIT_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse_Item#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link QuestionnaireResponse_Item#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link QuestionnaireResponse_Item#id() id} to id.
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
     * Initializes the optional value {@link QuestionnaireResponse_Item#id() id} to id.
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
     * Initializes the optional value {@link QuestionnaireResponse_Item#extension() extension} to extension.
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
     * Initializes the optional value {@link QuestionnaireResponse_Item#extension() extension} to extension.
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
     * Initializes the optional value {@link QuestionnaireResponse_Item#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for chained invocation
     */
    public final Builder definition(com.fhir.uri definition) {
      checkNotIsSet(definitionIsSet(), "definition");
      this.definition = java.util.Objects.requireNonNull(definition, "definition");
      optBits |= OPT_BIT_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse_Item#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definition")
    public final Builder definition(java.util.Optional<? extends com.fhir.uri> definition) {
      checkNotIsSet(definitionIsSet(), "definition");
      this.definition = definition.orElse(null);
      optBits |= OPT_BIT_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse_Item#answer() answer} to answer.
     * @param answer The value for answer
     * @return {@code this} builder for chained invocation
     */
    public final Builder answer(java.util.List<com.fhir.QuestionnaireResponse_Answer> answer) {
      checkNotIsSet(answerIsSet(), "answer");
      this.answer = java.util.Objects.requireNonNull(answer, "answer");
      optBits |= OPT_BIT_ANSWER;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse_Item#answer() answer} to answer.
     * @param answer The value for answer
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("answer")
    public final Builder answer(java.util.Optional<? extends java.util.List<com.fhir.QuestionnaireResponse_Answer>> answer) {
      checkNotIsSet(answerIsSet(), "answer");
      this.answer = answer.orElse(null);
      optBits |= OPT_BIT_ANSWER;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse_Item#linkId() linkId} to linkId.
     * @param linkId The value for linkId
     * @return {@code this} builder for chained invocation
     */
    public final Builder linkId(java.lang.String linkId) {
      checkNotIsSet(linkIdIsSet(), "linkId");
      this.linkId = java.util.Objects.requireNonNull(linkId, "linkId");
      optBits |= OPT_BIT_LINK_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse_Item#linkId() linkId} to linkId.
     * @param linkId The value for linkId
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("linkId")
    public final Builder linkId(java.util.Optional<java.lang.String> linkId) {
      checkNotIsSet(linkIdIsSet(), "linkId");
      this.linkId = linkId.orElse(null);
      optBits |= OPT_BIT_LINK_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse_Item#text() text} to text.
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
     * Initializes the optional value {@link QuestionnaireResponse_Item#text() text} to text.
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
     * Builds a new {@link QuestionnaireResponse_Item QuestionnaireResponse_Item}.
     * @return An immutable instance of QuestionnaireResponse_Item
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.QuestionnaireResponse_Item build() {
      return new ImmutableQuestionnaireResponse_Item(item, modifierExtension, id, extension, definition, answer, linkId, text);
    }

    private boolean itemIsSet() {
      return (optBits & OPT_BIT_ITEM) != 0;
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

    private boolean definitionIsSet() {
      return (optBits & OPT_BIT_DEFINITION) != 0;
    }

    private boolean answerIsSet() {
      return (optBits & OPT_BIT_ANSWER) != 0;
    }

    private boolean linkIdIsSet() {
      return (optBits & OPT_BIT_LINK_ID) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of QuestionnaireResponse_Item is strict, attribute is already set: ".concat(name));
    }
  }
}
