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
 * Immutable implementation of {@link MessageHeader_Response}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMessageHeader_Response.builder()}.
 */
@Generated(from = "MessageHeader_Response", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMessageHeader_Response implements MessageHeader_Response {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final @Nullable Messageheader_ResponseCode code;
  private final @Nullable Reference details;
  private final @Nullable List<Extension> extension;
  private final @Nullable Id identifier;

  private ImmutableMessageHeader_Response(
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      @Nullable Messageheader_ResponseCode code,
      @Nullable Reference details,
      @Nullable List<Extension> extension,
      @Nullable Id identifier) {
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.code = code;
    this.details = details;
    this.extension = extension;
    this.identifier = identifier;
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
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<Messageheader_ResponseCode> code() {
    return Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code details} attribute
   */
  @JsonProperty("details")
  @Override
  public Optional<Reference> details() {
    return Optional.ofNullable(details);
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
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<Id> identifier() {
    return Optional.ofNullable(identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader_Response#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Response withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMessageHeader_Response(newValue, this.id, this.code, this.details, this.extension, this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader_Response#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader_Response withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMessageHeader_Response(value, this.id, this.code, this.details, this.extension, this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader_Response#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Response withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMessageHeader_Response(this.modifierExtension, newValue, this.code, this.details, this.extension, this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader_Response#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Response withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMessageHeader_Response(this.modifierExtension, value, this.code, this.details, this.extension, this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader_Response#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Response withCode(Messageheader_ResponseCode value) {
    @Nullable Messageheader_ResponseCode newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableMessageHeader_Response(this.modifierExtension, this.id, newValue, this.details, this.extension, this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader_Response#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader_Response withCode(Optional<? extends Messageheader_ResponseCode> optional) {
    @Nullable Messageheader_ResponseCode value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableMessageHeader_Response(this.modifierExtension, this.id, value, this.details, this.extension, this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader_Response#details() details} attribute.
   * @param value The value for details
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Response withDetails(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "details");
    if (this.details == newValue) return this;
    return new ImmutableMessageHeader_Response(this.modifierExtension, this.id, this.code, newValue, this.extension, this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader_Response#details() details} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for details
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader_Response withDetails(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.details == value) return this;
    return new ImmutableMessageHeader_Response(this.modifierExtension, this.id, this.code, value, this.extension, this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader_Response#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Response withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMessageHeader_Response(this.modifierExtension, this.id, this.code, this.details, newValue, this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader_Response#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader_Response withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMessageHeader_Response(this.modifierExtension, this.id, this.code, this.details, value, this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader_Response#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Response withIdentifier(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableMessageHeader_Response(this.modifierExtension, this.id, this.code, this.details, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader_Response#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader_Response withIdentifier(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableMessageHeader_Response(this.modifierExtension, this.id, this.code, this.details, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMessageHeader_Response} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMessageHeader_Response
        && equalTo((ImmutableMessageHeader_Response) another);
  }

  private boolean equalTo(ImmutableMessageHeader_Response another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(code, another.code)
        && Objects.equals(details, another.details)
        && Objects.equals(extension, another.extension)
        && Objects.equals(identifier, another.identifier);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code id}, {@code code}, {@code details}, {@code extension}, {@code identifier}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(details);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(identifier);
    return h;
  }

  /**
   * Prints the immutable value {@code MessageHeader_Response} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MessageHeader_Response{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (code != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (details != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("details=").append(details);
    }
    if (extension != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (identifier != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MessageHeader_Response", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MessageHeader_Response {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Messageheader_ResponseCode> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<Reference> details = Optional.empty();
    boolean detailsIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Id> identifier = Optional.empty();
    boolean identifierIsSet;
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
    @JsonProperty("code")
    public void setCode(Optional<Messageheader_ResponseCode> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("details")
    public void setDetails(Optional<Reference> details) {
      this.details = details;
      this.detailsIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<Id> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Messageheader_ResponseCode> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> details() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> identifier() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMessageHeader_Response fromJson(Json json) {
    ImmutableMessageHeader_Response.Builder builder = ImmutableMessageHeader_Response.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.detailsIsSet) {
      builder.details(json.details);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    return (ImmutableMessageHeader_Response) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MessageHeader_Response} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MessageHeader_Response instance
   */
  public static MessageHeader_Response copyOf(MessageHeader_Response instance) {
    if (instance instanceof ImmutableMessageHeader_Response) {
      return (ImmutableMessageHeader_Response) instance;
    }
    return ImmutableMessageHeader_Response.builder()
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .code(instance.code())
        .details(instance.details())
        .extension(instance.extension())
        .identifier(instance.identifier())
        .build();
  }

  /**
   * Creates a builder for {@link MessageHeader_Response MessageHeader_Response}.
   * <pre>
   * ImmutableMessageHeader_Response.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MessageHeader_Response#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link MessageHeader_Response#id() id}
   *    .code(Messageheader_ResponseCode) // optional {@link MessageHeader_Response#code() code}
   *    .details(com.fhir.types.fhir.Reference) // optional {@link MessageHeader_Response#details() details}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MessageHeader_Response#extension() extension}
   *    .identifier(com.fhir.types.fhir.Id) // optional {@link MessageHeader_Response#identifier() identifier}
   *    .build();
   * </pre>
   * @return A new MessageHeader_Response builder
   */
  public static ImmutableMessageHeader_Response.Builder builder() {
    return new ImmutableMessageHeader_Response.Builder();
  }

  /**
   * Builds instances of type {@link MessageHeader_Response MessageHeader_Response}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MessageHeader_Response", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_CODE = 0x4L;
    private static final long OPT_BIT_DETAILS = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_IDENTIFIER = 0x20L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable Messageheader_ResponseCode code;
    private @Nullable Reference details;
    private @Nullable List<Extension> extension;
    private @Nullable Id identifier;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MessageHeader_Response#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MessageHeader_Response#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MessageHeader_Response#id() id} to id.
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
     * Initializes the optional value {@link MessageHeader_Response#id() id} to id.
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
     * Initializes the optional value {@link MessageHeader_Response#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(Messageheader_ResponseCode code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Response#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends Messageheader_ResponseCode> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Response#details() details} to details.
     * @param details The value for details
     * @return {@code this} builder for chained invocation
     */
    public final Builder details(Reference details) {
      checkNotIsSet(detailsIsSet(), "details");
      this.details = Objects.requireNonNull(details, "details");
      optBits |= OPT_BIT_DETAILS;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Response#details() details} to details.
     * @param details The value for details
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("details")
    public final Builder details(Optional<? extends Reference> details) {
      checkNotIsSet(detailsIsSet(), "details");
      this.details = details.orElse(null);
      optBits |= OPT_BIT_DETAILS;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Response#extension() extension} to extension.
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
     * Initializes the optional value {@link MessageHeader_Response#extension() extension} to extension.
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
     * Initializes the optional value {@link MessageHeader_Response#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(Id identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Response#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifier")
    public final Builder identifier(Optional<? extends Id> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Builds a new {@link MessageHeader_Response MessageHeader_Response}.
     * @return An immutable instance of MessageHeader_Response
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MessageHeader_Response build() {
      return new ImmutableMessageHeader_Response(modifierExtension, id, code, details, extension, identifier);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean detailsIsSet() {
      return (optBits & OPT_BIT_DETAILS) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MessageHeader_Response is strict, attribute is already set: ".concat(name));
    }
  }
}
