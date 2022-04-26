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
 * Immutable implementation of {@link MessageDefinition_AllowedResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMessageDefinition_AllowedResponse.builder()}.
 */
@Generated(from = "MessageDefinition_AllowedResponse", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMessageDefinition_AllowedResponse
    implements MessageDefinition_AllowedResponse {
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Markdown situation;
  private final Canonical message;
  private final @Nullable String id;

  private ImmutableMessageDefinition_AllowedResponse(
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable Markdown situation,
      Canonical message,
      @Nullable String id) {
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.situation = situation;
    this.message = message;
    this.id = id;
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
   * @return The value of the {@code situation} attribute
   */
  @JsonProperty("situation")
  @Override
  public Optional<Markdown> situation() {
    return Optional.ofNullable(situation);
  }

  /**
   * @return The value of the {@code message} attribute
   */
  @JsonProperty("message")
  @Override
  public Canonical message() {
    return message;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition_AllowedResponse#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition_AllowedResponse withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMessageDefinition_AllowedResponse(newValue, this.modifierExtension, this.situation, this.message, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition_AllowedResponse#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition_AllowedResponse withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMessageDefinition_AllowedResponse(value, this.modifierExtension, this.situation, this.message, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition_AllowedResponse#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition_AllowedResponse withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMessageDefinition_AllowedResponse(this.extension, newValue, this.situation, this.message, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition_AllowedResponse#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition_AllowedResponse withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMessageDefinition_AllowedResponse(this.extension, value, this.situation, this.message, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition_AllowedResponse#situation() situation} attribute.
   * @param value The value for situation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition_AllowedResponse withSituation(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "situation");
    if (this.situation == newValue) return this;
    return new ImmutableMessageDefinition_AllowedResponse(this.extension, this.modifierExtension, newValue, this.message, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition_AllowedResponse#situation() situation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for situation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition_AllowedResponse withSituation(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.situation == value) return this;
    return new ImmutableMessageDefinition_AllowedResponse(this.extension, this.modifierExtension, value, this.message, this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MessageDefinition_AllowedResponse#message() message} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for message
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMessageDefinition_AllowedResponse withMessage(Canonical value) {
    if (this.message == value) return this;
    Canonical newValue = Objects.requireNonNull(value, "message");
    return new ImmutableMessageDefinition_AllowedResponse(this.extension, this.modifierExtension, this.situation, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition_AllowedResponse#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition_AllowedResponse withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMessageDefinition_AllowedResponse(this.extension, this.modifierExtension, this.situation, this.message, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition_AllowedResponse#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition_AllowedResponse withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMessageDefinition_AllowedResponse(this.extension, this.modifierExtension, this.situation, this.message, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMessageDefinition_AllowedResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMessageDefinition_AllowedResponse
        && equalTo((ImmutableMessageDefinition_AllowedResponse) another);
  }

  private boolean equalTo(ImmutableMessageDefinition_AllowedResponse another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(situation, another.situation)
        && message.equals(another.message)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code modifierExtension}, {@code situation}, {@code message}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(situation);
    h += (h << 5) + message.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code MessageDefinition_AllowedResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MessageDefinition_AllowedResponse{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (situation != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("situation=").append(situation);
    }
    if (builder.length() > 34) builder.append(", ");
    builder.append("message=").append(message);
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
  @Generated(from = "MessageDefinition_AllowedResponse", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MessageDefinition_AllowedResponse {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Markdown> situation = Optional.empty();
    boolean situationIsSet;
    @Nullable Canonical message;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
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
    @JsonProperty("situation")
    public void setSituation(Optional<Markdown> situation) {
      this.situation = situation;
      this.situationIsSet = true;
    }
    @JsonProperty("message")
    public void setMessage(Canonical message) {
      this.message = message;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> situation() { throw new UnsupportedOperationException(); }
    @Override
    public Canonical message() { throw new UnsupportedOperationException(); }
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
  static ImmutableMessageDefinition_AllowedResponse fromJson(Json json) {
    ImmutableMessageDefinition_AllowedResponse.Builder builder = ((ImmutableMessageDefinition_AllowedResponse.Builder) ImmutableMessageDefinition_AllowedResponse.builder());
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.situationIsSet) {
      builder.situation(json.situation);
    }
    if (json.message != null) {
      builder.message(json.message);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableMessageDefinition_AllowedResponse) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MessageDefinition_AllowedResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MessageDefinition_AllowedResponse instance
   */
  public static MessageDefinition_AllowedResponse copyOf(MessageDefinition_AllowedResponse instance) {
    if (instance instanceof ImmutableMessageDefinition_AllowedResponse) {
      return (ImmutableMessageDefinition_AllowedResponse) instance;
    }
    return ((ImmutableMessageDefinition_AllowedResponse.Builder) ImmutableMessageDefinition_AllowedResponse.builder())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .situation(instance.situation())
        .message(instance.message())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link MessageDefinition_AllowedResponse MessageDefinition_AllowedResponse}.
   * <pre>
   * ImmutableMessageDefinition_AllowedResponse.builder()
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MessageDefinition_AllowedResponse#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MessageDefinition_AllowedResponse#modifierExtension() modifierExtension}
   *    .situation(com.fhir.types.fhir.Markdown) // optional {@link MessageDefinition_AllowedResponse#situation() situation}
   *    .message(com.fhir.types.fhir.Canonical) // required {@link MessageDefinition_AllowedResponse#message() message}
   *    .id(String) // optional {@link MessageDefinition_AllowedResponse#id() id}
   *    .build();
   * </pre>
   * @return A new MessageDefinition_AllowedResponse builder
   */
  public static MessageBuildStage builder() {
    return new ImmutableMessageDefinition_AllowedResponse.Builder();
  }

  /**
   * Builds instances of type {@link MessageDefinition_AllowedResponse MessageDefinition_AllowedResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MessageDefinition_AllowedResponse", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements MessageBuildStage, BuildFinal {
    private static final long INIT_BIT_MESSAGE = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_SITUATION = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Markdown situation;
    private @Nullable Canonical message;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MessageDefinition_AllowedResponse#extension() extension} to extension.
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
     * Initializes the optional value {@link MessageDefinition_AllowedResponse#extension() extension} to extension.
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
     * Initializes the optional value {@link MessageDefinition_AllowedResponse#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MessageDefinition_AllowedResponse#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MessageDefinition_AllowedResponse#situation() situation} to situation.
     * @param situation The value for situation
     * @return {@code this} builder for chained invocation
     */
    public final Builder situation(Markdown situation) {
      checkNotIsSet(situationIsSet(), "situation");
      this.situation = Objects.requireNonNull(situation, "situation");
      optBits |= OPT_BIT_SITUATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition_AllowedResponse#situation() situation} to situation.
     * @param situation The value for situation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("situation")
    public final Builder situation(Optional<? extends Markdown> situation) {
      checkNotIsSet(situationIsSet(), "situation");
      this.situation = situation.orElse(null);
      optBits |= OPT_BIT_SITUATION;
      return this;
    }

    /**
     * Initializes the value for the {@link MessageDefinition_AllowedResponse#message() message} attribute.
     * @param message The value for message 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("message")
    public final Builder message(Canonical message) {
      checkNotIsSet(messageIsSet(), "message");
      this.message = Objects.requireNonNull(message, "message");
      initBits &= ~INIT_BIT_MESSAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition_AllowedResponse#id() id} to id.
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
     * Initializes the optional value {@link MessageDefinition_AllowedResponse#id() id} to id.
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
     * Builds a new {@link MessageDefinition_AllowedResponse MessageDefinition_AllowedResponse}.
     * @return An immutable instance of MessageDefinition_AllowedResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MessageDefinition_AllowedResponse build() {
      checkRequiredAttributes();
      return new ImmutableMessageDefinition_AllowedResponse(extension, modifierExtension, situation, message, id);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean situationIsSet() {
      return (optBits & OPT_BIT_SITUATION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean messageIsSet() {
      return (initBits & INIT_BIT_MESSAGE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MessageDefinition_AllowedResponse is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!messageIsSet()) attributes.add("message");
      return "Cannot build MessageDefinition_AllowedResponse, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MessageDefinition_AllowedResponse", generator = "Immutables")
  public interface MessageBuildStage {
    /**
     * Initializes the value for the {@link MessageDefinition_AllowedResponse#message() message} attribute.
     * @param message The value for message 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal message(Canonical message);
  }

  @Generated(from = "MessageDefinition_AllowedResponse", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MessageDefinition_AllowedResponse#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MessageDefinition_AllowedResponse#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link MessageDefinition_AllowedResponse#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MessageDefinition_AllowedResponse#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MessageDefinition_AllowedResponse#situation() situation} to situation.
     * @param situation The value for situation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal situation(Markdown situation);

    /**
     * Initializes the optional value {@link MessageDefinition_AllowedResponse#situation() situation} to situation.
     * @param situation The value for situation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal situation(Optional<? extends Markdown> situation);

    /**
     * Initializes the optional value {@link MessageDefinition_AllowedResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link MessageDefinition_AllowedResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Builds a new {@link MessageDefinition_AllowedResponse MessageDefinition_AllowedResponse}.
     * @return An immutable instance of MessageDefinition_AllowedResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MessageDefinition_AllowedResponse build();
  }
}
