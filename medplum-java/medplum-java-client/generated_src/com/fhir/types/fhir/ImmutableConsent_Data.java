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
 * Immutable implementation of {@link Consent_Data}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableConsent_Data.builder()}.
 */
@Generated(from = "Consent_Data", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableConsent_Data implements Consent_Data {
  private final @Nullable Consent_DataMeaning meaning;
  private final @Nullable List<Extension> extension;
  private final Reference reference;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableConsent_Data(
      @Nullable Consent_DataMeaning meaning,
      @Nullable List<Extension> extension,
      Reference reference,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension) {
    this.meaning = meaning;
    this.extension = extension;
    this.reference = reference;
    this.id = id;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code meaning} attribute
   */
  @JsonProperty("meaning")
  @Override
  public Optional<Consent_DataMeaning> meaning() {
    return Optional.ofNullable(meaning);
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
   * @return The value of the {@code reference} attribute
   */
  @JsonProperty("reference")
  @Override
  public Reference reference() {
    return reference;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent_Data#meaning() meaning} attribute.
   * @param value The value for meaning
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Data withMeaning(Consent_DataMeaning value) {
    @Nullable Consent_DataMeaning newValue = Objects.requireNonNull(value, "meaning");
    if (this.meaning == newValue) return this;
    return new ImmutableConsent_Data(newValue, this.extension, this.reference, this.id, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent_Data#meaning() meaning} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meaning
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent_Data withMeaning(Optional<? extends Consent_DataMeaning> optional) {
    @Nullable Consent_DataMeaning value = optional.orElse(null);
    if (this.meaning == value) return this;
    return new ImmutableConsent_Data(value, this.extension, this.reference, this.id, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent_Data#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Data withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableConsent_Data(this.meaning, newValue, this.reference, this.id, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent_Data#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent_Data withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableConsent_Data(this.meaning, value, this.reference, this.id, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Consent_Data#reference() reference} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for reference
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableConsent_Data withReference(Reference value) {
    if (this.reference == value) return this;
    Reference newValue = Objects.requireNonNull(value, "reference");
    return new ImmutableConsent_Data(this.meaning, this.extension, newValue, this.id, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent_Data#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Data withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableConsent_Data(this.meaning, this.extension, this.reference, newValue, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent_Data#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Data withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableConsent_Data(this.meaning, this.extension, this.reference, value, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent_Data#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Data withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableConsent_Data(this.meaning, this.extension, this.reference, this.id, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent_Data#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent_Data withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableConsent_Data(this.meaning, this.extension, this.reference, this.id, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableConsent_Data} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableConsent_Data
        && equalTo((ImmutableConsent_Data) another);
  }

  private boolean equalTo(ImmutableConsent_Data another) {
    return Objects.equals(meaning, another.meaning)
        && Objects.equals(extension, another.extension)
        && reference.equals(another.reference)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code meaning}, {@code extension}, {@code reference}, {@code id}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(meaning);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + reference.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code Consent_Data} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Consent_Data{");
    if (meaning != null) {
      builder.append("meaning=").append(meaning);
    }
    if (extension != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 13) builder.append(", ");
    builder.append("reference=").append(reference);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Consent_Data", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Consent_Data {
    @Nullable Optional<Consent_DataMeaning> meaning = Optional.empty();
    boolean meaningIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Reference reference;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("meaning")
    public void setMeaning(Optional<Consent_DataMeaning> meaning) {
      this.meaning = meaning;
      this.meaningIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("reference")
    public void setReference(Reference reference) {
      this.reference = reference;
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
    @Override
    public Optional<Consent_DataMeaning> meaning() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Reference reference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
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
  static ImmutableConsent_Data fromJson(Json json) {
    ImmutableConsent_Data.Builder builder = ((ImmutableConsent_Data.Builder) ImmutableConsent_Data.builder());
    if (json.meaningIsSet) {
      builder.meaning(json.meaning);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.reference != null) {
      builder.reference(json.reference);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableConsent_Data) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Consent_Data} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Consent_Data instance
   */
  public static Consent_Data copyOf(Consent_Data instance) {
    if (instance instanceof ImmutableConsent_Data) {
      return (ImmutableConsent_Data) instance;
    }
    return ((ImmutableConsent_Data.Builder) ImmutableConsent_Data.builder())
        .meaning(instance.meaning())
        .extension(instance.extension())
        .reference(instance.reference())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link Consent_Data Consent_Data}.
   * <pre>
   * ImmutableConsent_Data.builder()
   *    .meaning(Consent_DataMeaning) // optional {@link Consent_Data#meaning() meaning}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Consent_Data#extension() extension}
   *    .reference(com.fhir.types.fhir.Reference) // required {@link Consent_Data#reference() reference}
   *    .id(String) // optional {@link Consent_Data#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Consent_Data#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new Consent_Data builder
   */
  public static ReferenceBuildStage builder() {
    return new ImmutableConsent_Data.Builder();
  }

  /**
   * Builds instances of type {@link Consent_Data Consent_Data}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Consent_Data", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ReferenceBuildStage, BuildFinal {
    private static final long INIT_BIT_REFERENCE = 0x1L;
    private static final long OPT_BIT_MEANING = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Consent_DataMeaning meaning;
    private @Nullable List<Extension> extension;
    private @Nullable Reference reference;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Consent_Data#meaning() meaning} to meaning.
     * @param meaning The value for meaning
     * @return {@code this} builder for chained invocation
     */
    public final Builder meaning(Consent_DataMeaning meaning) {
      checkNotIsSet(meaningIsSet(), "meaning");
      this.meaning = Objects.requireNonNull(meaning, "meaning");
      optBits |= OPT_BIT_MEANING;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent_Data#meaning() meaning} to meaning.
     * @param meaning The value for meaning
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("meaning")
    public final Builder meaning(Optional<? extends Consent_DataMeaning> meaning) {
      checkNotIsSet(meaningIsSet(), "meaning");
      this.meaning = meaning.orElse(null);
      optBits |= OPT_BIT_MEANING;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent_Data#extension() extension} to extension.
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
     * Initializes the optional value {@link Consent_Data#extension() extension} to extension.
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
     * Initializes the value for the {@link Consent_Data#reference() reference} attribute.
     * @param reference The value for reference 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reference")
    public final Builder reference(Reference reference) {
      checkNotIsSet(referenceIsSet(), "reference");
      this.reference = Objects.requireNonNull(reference, "reference");
      initBits &= ~INIT_BIT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent_Data#id() id} to id.
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
     * Initializes the optional value {@link Consent_Data#id() id} to id.
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
     * Initializes the optional value {@link Consent_Data#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Consent_Data#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link Consent_Data Consent_Data}.
     * @return An immutable instance of Consent_Data
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Consent_Data build() {
      checkRequiredAttributes();
      return new ImmutableConsent_Data(meaning, extension, reference, id, modifierExtension);
    }

    private boolean meaningIsSet() {
      return (optBits & OPT_BIT_MEANING) != 0;
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

    private boolean referenceIsSet() {
      return (initBits & INIT_BIT_REFERENCE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Consent_Data is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!referenceIsSet()) attributes.add("reference");
      return "Cannot build Consent_Data, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Consent_Data", generator = "Immutables")
  public interface ReferenceBuildStage {
    /**
     * Initializes the value for the {@link Consent_Data#reference() reference} attribute.
     * @param reference The value for reference 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reference(Reference reference);
  }

  @Generated(from = "Consent_Data", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Consent_Data#meaning() meaning} to meaning.
     * @param meaning The value for meaning
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meaning(Consent_DataMeaning meaning);

    /**
     * Initializes the optional value {@link Consent_Data#meaning() meaning} to meaning.
     * @param meaning The value for meaning
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meaning(Optional<? extends Consent_DataMeaning> meaning);

    /**
     * Initializes the optional value {@link Consent_Data#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Consent_Data#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Consent_Data#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link Consent_Data#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link Consent_Data#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Consent_Data#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Builds a new {@link Consent_Data Consent_Data}.
     * @return An immutable instance of Consent_Data
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Consent_Data build();
  }
}
