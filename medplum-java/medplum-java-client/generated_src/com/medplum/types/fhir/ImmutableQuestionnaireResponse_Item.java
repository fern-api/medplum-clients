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
 * Immutable implementation of {@link QuestionnaireResponse_Item}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableQuestionnaireResponse_Item.builder()}.
 */
@Generated(from = "QuestionnaireResponse_Item", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableQuestionnaireResponse_Item
    implements QuestionnaireResponse_Item {
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Uri definition;
  private final @Nullable String text;
  private final @Nullable String linkId;
  private final @Nullable List<QuestionnaireResponse_Answer> answer;
  private final @Nullable List<QuestionnaireResponse_Item> item;
  private final @Nullable List<Extension> extension;

  private ImmutableQuestionnaireResponse_Item(
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable Uri definition,
      @Nullable String text,
      @Nullable String linkId,
      @Nullable List<QuestionnaireResponse_Answer> answer,
      @Nullable List<QuestionnaireResponse_Item> item,
      @Nullable List<Extension> extension) {
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.definition = definition;
    this.text = text;
    this.linkId = linkId;
    this.answer = answer;
    this.item = item;
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code definition} attribute
   */
  @JsonProperty("definition")
  @Override
  public Optional<Uri> definition() {
    return Optional.ofNullable(definition);
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
   * @return The value of the {@code linkId} attribute
   */
  @JsonProperty("linkId")
  @Override
  public Optional<String> linkId() {
    return Optional.ofNullable(linkId);
  }

  /**
   * @return The value of the {@code answer} attribute
   */
  @JsonProperty("answer")
  @Override
  public Optional<List<QuestionnaireResponse_Answer>> answer() {
    return Optional.ofNullable(answer);
  }

  /**
   * @return The value of the {@code item} attribute
   */
  @JsonProperty("item")
  @Override
  public Optional<List<QuestionnaireResponse_Item>> item() {
    return Optional.ofNullable(item);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse_Item#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Item withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableQuestionnaireResponse_Item(
        newValue,
        this.modifierExtension,
        this.definition,
        this.text,
        this.linkId,
        this.answer,
        this.item,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse_Item#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Item withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableQuestionnaireResponse_Item(
        value,
        this.modifierExtension,
        this.definition,
        this.text,
        this.linkId,
        this.answer,
        this.item,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse_Item#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Item withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableQuestionnaireResponse_Item(
        this.id,
        newValue,
        this.definition,
        this.text,
        this.linkId,
        this.answer,
        this.item,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse_Item#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse_Item withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableQuestionnaireResponse_Item(this.id, value, this.definition, this.text, this.linkId, this.answer, this.item, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse_Item#definition() definition} attribute.
   * @param value The value for definition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Item withDefinition(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "definition");
    if (this.definition == newValue) return this;
    return new ImmutableQuestionnaireResponse_Item(
        this.id,
        this.modifierExtension,
        newValue,
        this.text,
        this.linkId,
        this.answer,
        this.item,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse_Item#definition() definition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for definition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse_Item withDefinition(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.definition == value) return this;
    return new ImmutableQuestionnaireResponse_Item(
        this.id,
        this.modifierExtension,
        value,
        this.text,
        this.linkId,
        this.answer,
        this.item,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse_Item#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Item withText(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "text");
    if (Objects.equals(this.text, newValue)) return this;
    return new ImmutableQuestionnaireResponse_Item(
        this.id,
        this.modifierExtension,
        this.definition,
        newValue,
        this.linkId,
        this.answer,
        this.item,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse_Item#text() text} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Item withText(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.text, value)) return this;
    return new ImmutableQuestionnaireResponse_Item(
        this.id,
        this.modifierExtension,
        this.definition,
        value,
        this.linkId,
        this.answer,
        this.item,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse_Item#linkId() linkId} attribute.
   * @param value The value for linkId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Item withLinkId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "linkId");
    if (Objects.equals(this.linkId, newValue)) return this;
    return new ImmutableQuestionnaireResponse_Item(
        this.id,
        this.modifierExtension,
        this.definition,
        this.text,
        newValue,
        this.answer,
        this.item,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse_Item#linkId() linkId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for linkId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Item withLinkId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.linkId, value)) return this;
    return new ImmutableQuestionnaireResponse_Item(
        this.id,
        this.modifierExtension,
        this.definition,
        this.text,
        value,
        this.answer,
        this.item,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse_Item#answer() answer} attribute.
   * @param value The value for answer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Item withAnswer(List<QuestionnaireResponse_Answer> value) {
    @Nullable List<QuestionnaireResponse_Answer> newValue = Objects.requireNonNull(value, "answer");
    if (this.answer == newValue) return this;
    return new ImmutableQuestionnaireResponse_Item(
        this.id,
        this.modifierExtension,
        this.definition,
        this.text,
        this.linkId,
        newValue,
        this.item,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse_Item#answer() answer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for answer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse_Item withAnswer(Optional<? extends List<QuestionnaireResponse_Answer>> optional) {
    @Nullable List<QuestionnaireResponse_Answer> value = optional.orElse(null);
    if (this.answer == value) return this;
    return new ImmutableQuestionnaireResponse_Item(
        this.id,
        this.modifierExtension,
        this.definition,
        this.text,
        this.linkId,
        value,
        this.item,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse_Item#item() item} attribute.
   * @param value The value for item
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Item withItem(List<QuestionnaireResponse_Item> value) {
    @Nullable List<QuestionnaireResponse_Item> newValue = Objects.requireNonNull(value, "item");
    if (this.item == newValue) return this;
    return new ImmutableQuestionnaireResponse_Item(
        this.id,
        this.modifierExtension,
        this.definition,
        this.text,
        this.linkId,
        this.answer,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse_Item#item() item} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for item
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse_Item withItem(Optional<? extends List<QuestionnaireResponse_Item>> optional) {
    @Nullable List<QuestionnaireResponse_Item> value = optional.orElse(null);
    if (this.item == value) return this;
    return new ImmutableQuestionnaireResponse_Item(
        this.id,
        this.modifierExtension,
        this.definition,
        this.text,
        this.linkId,
        this.answer,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse_Item#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Item withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableQuestionnaireResponse_Item(
        this.id,
        this.modifierExtension,
        this.definition,
        this.text,
        this.linkId,
        this.answer,
        this.item,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse_Item#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse_Item withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableQuestionnaireResponse_Item(
        this.id,
        this.modifierExtension,
        this.definition,
        this.text,
        this.linkId,
        this.answer,
        this.item,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableQuestionnaireResponse_Item} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableQuestionnaireResponse_Item
        && equalTo((ImmutableQuestionnaireResponse_Item) another);
  }

  private boolean equalTo(ImmutableQuestionnaireResponse_Item another) {
    return Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(definition, another.definition)
        && Objects.equals(text, another.text)
        && Objects.equals(linkId, another.linkId)
        && Objects.equals(answer, another.answer)
        && Objects.equals(item, another.item)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code modifierExtension}, {@code definition}, {@code text}, {@code linkId}, {@code answer}, {@code item}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(definition);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(linkId);
    h += (h << 5) + Objects.hashCode(answer);
    h += (h << 5) + Objects.hashCode(item);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code QuestionnaireResponse_Item} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("QuestionnaireResponse_Item{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (definition != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("definition=").append(definition);
    }
    if (text != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (linkId != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("linkId=").append(linkId);
    }
    if (answer != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("answer=").append(answer);
    }
    if (item != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("item=").append(item);
    }
    if (extension != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "QuestionnaireResponse_Item", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements QuestionnaireResponse_Item {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Uri> definition = Optional.empty();
    boolean definitionIsSet;
    @Nullable Optional<String> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<String> linkId = Optional.empty();
    boolean linkIdIsSet;
    @Nullable Optional<List<QuestionnaireResponse_Answer>> answer = Optional.empty();
    boolean answerIsSet;
    @Nullable Optional<List<QuestionnaireResponse_Item>> item = Optional.empty();
    boolean itemIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("definition")
    public void setDefinition(Optional<Uri> definition) {
      this.definition = definition;
      this.definitionIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<String> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("linkId")
    public void setLinkId(Optional<String> linkId) {
      this.linkId = linkId;
      this.linkIdIsSet = true;
    }
    @JsonProperty("answer")
    public void setAnswer(Optional<List<QuestionnaireResponse_Answer>> answer) {
      this.answer = answer;
      this.answerIsSet = true;
    }
    @JsonProperty("item")
    public void setItem(Optional<List<QuestionnaireResponse_Item>> item) {
      this.item = item;
      this.itemIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> definition() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> linkId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<QuestionnaireResponse_Answer>> answer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<QuestionnaireResponse_Item>> item() { throw new UnsupportedOperationException(); }
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
  static ImmutableQuestionnaireResponse_Item fromJson(Json json) {
    ImmutableQuestionnaireResponse_Item.Builder builder = ImmutableQuestionnaireResponse_Item.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.definitionIsSet) {
      builder.definition(json.definition);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.linkIdIsSet) {
      builder.linkId(json.linkId);
    }
    if (json.answerIsSet) {
      builder.answer(json.answer);
    }
    if (json.itemIsSet) {
      builder.item(json.item);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
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
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .definition(instance.definition())
        .text(instance.text())
        .linkId(instance.linkId())
        .answer(instance.answer())
        .item(instance.item())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link QuestionnaireResponse_Item QuestionnaireResponse_Item}.
   * <pre>
   * ImmutableQuestionnaireResponse_Item.builder()
   *    .id(String) // optional {@link QuestionnaireResponse_Item#id() id}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link QuestionnaireResponse_Item#modifierExtension() modifierExtension}
   *    .definition(com.medplum.types.fhir.Uri) // optional {@link QuestionnaireResponse_Item#definition() definition}
   *    .text(String) // optional {@link QuestionnaireResponse_Item#text() text}
   *    .linkId(String) // optional {@link QuestionnaireResponse_Item#linkId() linkId}
   *    .answer(List&amp;lt;com.medplum.types.fhir.QuestionnaireResponse_Answer&amp;gt;) // optional {@link QuestionnaireResponse_Item#answer() answer}
   *    .item(List&amp;lt;com.medplum.types.fhir.QuestionnaireResponse_Item&amp;gt;) // optional {@link QuestionnaireResponse_Item#item() item}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link QuestionnaireResponse_Item#extension() extension}
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
  @Generated(from = "QuestionnaireResponse_Item", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_DEFINITION = 0x4L;
    private static final long OPT_BIT_TEXT = 0x8L;
    private static final long OPT_BIT_LINK_ID = 0x10L;
    private static final long OPT_BIT_ANSWER = 0x20L;
    private static final long OPT_BIT_ITEM = 0x40L;
    private static final long OPT_BIT_EXTENSION = 0x80L;
    private long optBits;

    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Uri definition;
    private @Nullable String text;
    private @Nullable String linkId;
    private @Nullable List<QuestionnaireResponse_Answer> answer;
    private @Nullable List<QuestionnaireResponse_Item> item;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse_Item#id() id} to id.
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
     * Initializes the optional value {@link QuestionnaireResponse_Item#id() id} to id.
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
     * Initializes the optional value {@link QuestionnaireResponse_Item#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link QuestionnaireResponse_Item#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link QuestionnaireResponse_Item#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for chained invocation
     */
    public final Builder definition(Uri definition) {
      checkNotIsSet(definitionIsSet(), "definition");
      this.definition = Objects.requireNonNull(definition, "definition");
      optBits |= OPT_BIT_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse_Item#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("definition")
    public final Builder definition(Optional<? extends Uri> definition) {
      checkNotIsSet(definitionIsSet(), "definition");
      this.definition = definition.orElse(null);
      optBits |= OPT_BIT_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse_Item#text() text} to text.
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
     * Initializes the optional value {@link QuestionnaireResponse_Item#text() text} to text.
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
     * Initializes the optional value {@link QuestionnaireResponse_Item#linkId() linkId} to linkId.
     * @param linkId The value for linkId
     * @return {@code this} builder for chained invocation
     */
    public final Builder linkId(String linkId) {
      checkNotIsSet(linkIdIsSet(), "linkId");
      this.linkId = Objects.requireNonNull(linkId, "linkId");
      optBits |= OPT_BIT_LINK_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse_Item#linkId() linkId} to linkId.
     * @param linkId The value for linkId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("linkId")
    public final Builder linkId(Optional<String> linkId) {
      checkNotIsSet(linkIdIsSet(), "linkId");
      this.linkId = linkId.orElse(null);
      optBits |= OPT_BIT_LINK_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse_Item#answer() answer} to answer.
     * @param answer The value for answer
     * @return {@code this} builder for chained invocation
     */
    public final Builder answer(List<QuestionnaireResponse_Answer> answer) {
      checkNotIsSet(answerIsSet(), "answer");
      this.answer = Objects.requireNonNull(answer, "answer");
      optBits |= OPT_BIT_ANSWER;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse_Item#answer() answer} to answer.
     * @param answer The value for answer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("answer")
    public final Builder answer(Optional<? extends List<QuestionnaireResponse_Answer>> answer) {
      checkNotIsSet(answerIsSet(), "answer");
      this.answer = answer.orElse(null);
      optBits |= OPT_BIT_ANSWER;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse_Item#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for chained invocation
     */
    public final Builder item(List<QuestionnaireResponse_Item> item) {
      checkNotIsSet(itemIsSet(), "item");
      this.item = Objects.requireNonNull(item, "item");
      optBits |= OPT_BIT_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse_Item#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("item")
    public final Builder item(Optional<? extends List<QuestionnaireResponse_Item>> item) {
      checkNotIsSet(itemIsSet(), "item");
      this.item = item.orElse(null);
      optBits |= OPT_BIT_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse_Item#extension() extension} to extension.
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
     * Initializes the optional value {@link QuestionnaireResponse_Item#extension() extension} to extension.
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
     * Builds a new {@link QuestionnaireResponse_Item QuestionnaireResponse_Item}.
     * @return An immutable instance of QuestionnaireResponse_Item
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public QuestionnaireResponse_Item build() {
      return new ImmutableQuestionnaireResponse_Item(id, modifierExtension, definition, text, linkId, answer, item, extension);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean definitionIsSet() {
      return (optBits & OPT_BIT_DEFINITION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean linkIdIsSet() {
      return (optBits & OPT_BIT_LINK_ID) != 0;
    }

    private boolean answerIsSet() {
      return (optBits & OPT_BIT_ANSWER) != 0;
    }

    private boolean itemIsSet() {
      return (optBits & OPT_BIT_ITEM) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of QuestionnaireResponse_Item is strict, attribute is already set: ".concat(name));
    }
  }
}
