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
 * Immutable implementation of {@link PaymentReconciliation_ProcessNote}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePaymentReconciliation_ProcessNote.builder()}.
 */
@Generated(from = "PaymentReconciliation_ProcessNote", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutablePaymentReconciliation_ProcessNote
    implements PaymentReconciliation_ProcessNote {
  private final @Nullable String text;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Paymentreconciliation_processnoteType type;

  private ImmutablePaymentReconciliation_ProcessNote(
      @Nullable String text,
      @Nullable List<Extension> extension,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable Paymentreconciliation_processnoteType type) {
    this.text = text;
    this.extension = extension;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.type = type;
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<Paymentreconciliation_processnoteType> type() {
    return Optional.ofNullable(type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation_ProcessNote#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation_ProcessNote withText(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "text");
    if (Objects.equals(this.text, newValue)) return this;
    return new ImmutablePaymentReconciliation_ProcessNote(newValue, this.extension, this.id, this.modifierExtension, this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation_ProcessNote#text() text} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation_ProcessNote withText(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.text, value)) return this;
    return new ImmutablePaymentReconciliation_ProcessNote(value, this.extension, this.id, this.modifierExtension, this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation_ProcessNote#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation_ProcessNote withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutablePaymentReconciliation_ProcessNote(this.text, newValue, this.id, this.modifierExtension, this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation_ProcessNote#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation_ProcessNote withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutablePaymentReconciliation_ProcessNote(this.text, value, this.id, this.modifierExtension, this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation_ProcessNote#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation_ProcessNote withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutablePaymentReconciliation_ProcessNote(this.text, this.extension, newValue, this.modifierExtension, this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation_ProcessNote#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation_ProcessNote withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutablePaymentReconciliation_ProcessNote(this.text, this.extension, value, this.modifierExtension, this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation_ProcessNote#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation_ProcessNote withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutablePaymentReconciliation_ProcessNote(this.text, this.extension, this.id, newValue, this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation_ProcessNote#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation_ProcessNote withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutablePaymentReconciliation_ProcessNote(this.text, this.extension, this.id, value, this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation_ProcessNote#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation_ProcessNote withType(Paymentreconciliation_processnoteType value) {
    @Nullable Paymentreconciliation_processnoteType newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutablePaymentReconciliation_ProcessNote(this.text, this.extension, this.id, this.modifierExtension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation_ProcessNote#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation_ProcessNote withType(Optional<? extends Paymentreconciliation_processnoteType> optional) {
    @Nullable Paymentreconciliation_processnoteType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutablePaymentReconciliation_ProcessNote(this.text, this.extension, this.id, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePaymentReconciliation_ProcessNote} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePaymentReconciliation_ProcessNote
        && equalTo((ImmutablePaymentReconciliation_ProcessNote) another);
  }

  private boolean equalTo(ImmutablePaymentReconciliation_ProcessNote another) {
    return Objects.equals(text, another.text)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(type, another.type);
  }

  /**
   * Computes a hash code from attributes: {@code text}, {@code extension}, {@code id}, {@code modifierExtension}, {@code type}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(type);
    return h;
  }

  /**
   * Prints the immutable value {@code PaymentReconciliation_ProcessNote} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("PaymentReconciliation_ProcessNote{");
    if (text != null) {
      builder.append("text=").append(text);
    }
    if (extension != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (type != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("type=").append(type);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "PaymentReconciliation_ProcessNote", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements PaymentReconciliation_ProcessNote {
    @Nullable Optional<String> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Paymentreconciliation_processnoteType> type = Optional.empty();
    boolean typeIsSet;
    @JsonProperty("text")
    public void setText(Optional<String> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
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
    @JsonProperty("type")
    public void setType(Optional<Paymentreconciliation_processnoteType> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @Override
    public Optional<String> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Paymentreconciliation_processnoteType> type() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePaymentReconciliation_ProcessNote fromJson(Json json) {
    ImmutablePaymentReconciliation_ProcessNote.Builder builder = ImmutablePaymentReconciliation_ProcessNote.builder();
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    return (ImmutablePaymentReconciliation_ProcessNote) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PaymentReconciliation_ProcessNote} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PaymentReconciliation_ProcessNote instance
   */
  public static PaymentReconciliation_ProcessNote copyOf(PaymentReconciliation_ProcessNote instance) {
    if (instance instanceof ImmutablePaymentReconciliation_ProcessNote) {
      return (ImmutablePaymentReconciliation_ProcessNote) instance;
    }
    return ImmutablePaymentReconciliation_ProcessNote.builder()
        .text(instance.text())
        .extension(instance.extension())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .type(instance.type())
        .build();
  }

  /**
   * Creates a builder for {@link PaymentReconciliation_ProcessNote PaymentReconciliation_ProcessNote}.
   * <pre>
   * ImmutablePaymentReconciliation_ProcessNote.builder()
   *    .text(String) // optional {@link PaymentReconciliation_ProcessNote#text() text}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link PaymentReconciliation_ProcessNote#extension() extension}
   *    .id(String) // optional {@link PaymentReconciliation_ProcessNote#id() id}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link PaymentReconciliation_ProcessNote#modifierExtension() modifierExtension}
   *    .type(com.medplum.types.fhir.Paymentreconciliation_processnoteType) // optional {@link PaymentReconciliation_ProcessNote#type() type}
   *    .build();
   * </pre>
   * @return A new PaymentReconciliation_ProcessNote builder
   */
  public static ImmutablePaymentReconciliation_ProcessNote.Builder builder() {
    return new ImmutablePaymentReconciliation_ProcessNote.Builder();
  }

  /**
   * Builds instances of type {@link PaymentReconciliation_ProcessNote PaymentReconciliation_ProcessNote}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "PaymentReconciliation_ProcessNote", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_TEXT = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_TYPE = 0x10L;
    private long optBits;

    private @Nullable String text;
    private @Nullable List<Extension> extension;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Paymentreconciliation_processnoteType type;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation_ProcessNote#text() text} to text.
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
     * Initializes the optional value {@link PaymentReconciliation_ProcessNote#text() text} to text.
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
     * Initializes the optional value {@link PaymentReconciliation_ProcessNote#extension() extension} to extension.
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
     * Initializes the optional value {@link PaymentReconciliation_ProcessNote#extension() extension} to extension.
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
     * Initializes the optional value {@link PaymentReconciliation_ProcessNote#id() id} to id.
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
     * Initializes the optional value {@link PaymentReconciliation_ProcessNote#id() id} to id.
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
     * Initializes the optional value {@link PaymentReconciliation_ProcessNote#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PaymentReconciliation_ProcessNote#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PaymentReconciliation_ProcessNote#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(Paymentreconciliation_processnoteType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation_ProcessNote#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends Paymentreconciliation_processnoteType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Builds a new {@link PaymentReconciliation_ProcessNote PaymentReconciliation_ProcessNote}.
     * @return An immutable instance of PaymentReconciliation_ProcessNote
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public PaymentReconciliation_ProcessNote build() {
      return new ImmutablePaymentReconciliation_ProcessNote(text, extension, id, modifierExtension, type);
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of PaymentReconciliation_ProcessNote is strict, attribute is already set: ".concat(name));
    }
  }
}
