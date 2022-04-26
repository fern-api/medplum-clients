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
 * Immutable implementation of {@link RelatedPerson_Communication}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRelatedPerson_Communication.builder()}.
 */
@Generated(from = "RelatedPerson_Communication", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableRelatedPerson_Communication
    implements RelatedPerson_Communication {
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Boolean preferred;
  private final CodeableConcept language;

  private ImmutableRelatedPerson_Communication(
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable Boolean preferred,
      CodeableConcept language) {
    this.id = id;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.preferred = preferred;
    this.language = language;
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code preferred} attribute
   */
  @JsonProperty("preferred")
  @Override
  public Optional<Boolean> preferred() {
    return Optional.ofNullable(preferred);
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public CodeableConcept language() {
    return language;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedPerson_Communication#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedPerson_Communication withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableRelatedPerson_Communication(newValue, this.extension, this.modifierExtension, this.preferred, this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedPerson_Communication#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedPerson_Communication withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableRelatedPerson_Communication(value, this.extension, this.modifierExtension, this.preferred, this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedPerson_Communication#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedPerson_Communication withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableRelatedPerson_Communication(this.id, newValue, this.modifierExtension, this.preferred, this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedPerson_Communication#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRelatedPerson_Communication withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableRelatedPerson_Communication(this.id, value, this.modifierExtension, this.preferred, this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedPerson_Communication#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedPerson_Communication withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableRelatedPerson_Communication(this.id, this.extension, newValue, this.preferred, this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedPerson_Communication#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRelatedPerson_Communication withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableRelatedPerson_Communication(this.id, this.extension, value, this.preferred, this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedPerson_Communication#preferred() preferred} attribute.
   * @param value The value for preferred
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedPerson_Communication withPreferred(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.preferred, newValue)) return this;
    return new ImmutableRelatedPerson_Communication(this.id, this.extension, this.modifierExtension, newValue, this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedPerson_Communication#preferred() preferred} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for preferred
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedPerson_Communication withPreferred(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.preferred, value)) return this;
    return new ImmutableRelatedPerson_Communication(this.id, this.extension, this.modifierExtension, value, this.language);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RelatedPerson_Communication#language() language} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for language
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRelatedPerson_Communication withLanguage(CodeableConcept value) {
    if (this.language == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "language");
    return new ImmutableRelatedPerson_Communication(this.id, this.extension, this.modifierExtension, this.preferred, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRelatedPerson_Communication} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRelatedPerson_Communication
        && equalTo((ImmutableRelatedPerson_Communication) another);
  }

  private boolean equalTo(ImmutableRelatedPerson_Communication another) {
    return Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(preferred, another.preferred)
        && language.equals(another.language);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code extension}, {@code modifierExtension}, {@code preferred}, {@code language}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(preferred);
    h += (h << 5) + language.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code RelatedPerson_Communication} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("RelatedPerson_Communication{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (preferred != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("preferred=").append(preferred);
    }
    if (builder.length() > 28) builder.append(", ");
    builder.append("language=").append(language);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "RelatedPerson_Communication", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements RelatedPerson_Communication {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Boolean> preferred = Optional.empty();
    boolean preferredIsSet;
    @Nullable CodeableConcept language;
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
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("preferred")
    public void setPreferred(Optional<Boolean> preferred) {
      this.preferred = preferred;
      this.preferredIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(CodeableConcept language) {
      this.language = language;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> preferred() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept language() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableRelatedPerson_Communication fromJson(Json json) {
    ImmutableRelatedPerson_Communication.Builder builder = ((ImmutableRelatedPerson_Communication.Builder) ImmutableRelatedPerson_Communication.builder());
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.preferredIsSet) {
      builder.preferred(json.preferred);
    }
    if (json.language != null) {
      builder.language(json.language);
    }
    return (ImmutableRelatedPerson_Communication) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link RelatedPerson_Communication} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RelatedPerson_Communication instance
   */
  public static RelatedPerson_Communication copyOf(RelatedPerson_Communication instance) {
    if (instance instanceof ImmutableRelatedPerson_Communication) {
      return (ImmutableRelatedPerson_Communication) instance;
    }
    return ((ImmutableRelatedPerson_Communication.Builder) ImmutableRelatedPerson_Communication.builder())
        .id(instance.id())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .preferred(instance.preferred())
        .language(instance.language())
        .build();
  }

  /**
   * Creates a builder for {@link RelatedPerson_Communication RelatedPerson_Communication}.
   * <pre>
   * ImmutableRelatedPerson_Communication.builder()
   *    .id(String) // optional {@link RelatedPerson_Communication#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link RelatedPerson_Communication#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link RelatedPerson_Communication#modifierExtension() modifierExtension}
   *    .preferred(Boolean) // optional {@link RelatedPerson_Communication#preferred() preferred}
   *    .language(com.fhir.types.fhir.CodeableConcept) // required {@link RelatedPerson_Communication#language() language}
   *    .build();
   * </pre>
   * @return A new RelatedPerson_Communication builder
   */
  public static LanguageBuildStage builder() {
    return new ImmutableRelatedPerson_Communication.Builder();
  }

  /**
   * Builds instances of type {@link RelatedPerson_Communication RelatedPerson_Communication}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "RelatedPerson_Communication", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements LanguageBuildStage, BuildFinal {
    private static final long INIT_BIT_LANGUAGE = 0x1L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_PREFERRED = 0x8L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Boolean preferred;
    private @Nullable CodeableConcept language;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link RelatedPerson_Communication#id() id} to id.
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
     * Initializes the optional value {@link RelatedPerson_Communication#id() id} to id.
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
     * Initializes the optional value {@link RelatedPerson_Communication#extension() extension} to extension.
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
     * Initializes the optional value {@link RelatedPerson_Communication#extension() extension} to extension.
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
     * Initializes the optional value {@link RelatedPerson_Communication#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link RelatedPerson_Communication#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link RelatedPerson_Communication#preferred() preferred} to preferred.
     * @param preferred The value for preferred
     * @return {@code this} builder for chained invocation
     */
    public final Builder preferred(boolean preferred) {
      checkNotIsSet(preferredIsSet(), "preferred");
      this.preferred = preferred;
      optBits |= OPT_BIT_PREFERRED;
      return this;
    }

    /**
     * Initializes the optional value {@link RelatedPerson_Communication#preferred() preferred} to preferred.
     * @param preferred The value for preferred
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("preferred")
    public final Builder preferred(Optional<Boolean> preferred) {
      checkNotIsSet(preferredIsSet(), "preferred");
      this.preferred = preferred.orElse(null);
      optBits |= OPT_BIT_PREFERRED;
      return this;
    }

    /**
     * Initializes the value for the {@link RelatedPerson_Communication#language() language} attribute.
     * @param language The value for language 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("language")
    public final Builder language(CodeableConcept language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = Objects.requireNonNull(language, "language");
      initBits &= ~INIT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Builds a new {@link RelatedPerson_Communication RelatedPerson_Communication}.
     * @return An immutable instance of RelatedPerson_Communication
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public RelatedPerson_Communication build() {
      checkRequiredAttributes();
      return new ImmutableRelatedPerson_Communication(id, extension, modifierExtension, preferred, language);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean preferredIsSet() {
      return (optBits & OPT_BIT_PREFERRED) != 0;
    }

    private boolean languageIsSet() {
      return (initBits & INIT_BIT_LANGUAGE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of RelatedPerson_Communication is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!languageIsSet()) attributes.add("language");
      return "Cannot build RelatedPerson_Communication, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "RelatedPerson_Communication", generator = "Immutables")
  public interface LanguageBuildStage {
    /**
     * Initializes the value for the {@link RelatedPerson_Communication#language() language} attribute.
     * @param language The value for language 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(CodeableConcept language);
  }

  @Generated(from = "RelatedPerson_Communication", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link RelatedPerson_Communication#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link RelatedPerson_Communication#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link RelatedPerson_Communication#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link RelatedPerson_Communication#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link RelatedPerson_Communication#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link RelatedPerson_Communication#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link RelatedPerson_Communication#preferred() preferred} to preferred.
     * @param preferred The value for preferred
     * @return {@code this} builder for chained invocation
     */
    BuildFinal preferred(boolean preferred);

    /**
     * Initializes the optional value {@link RelatedPerson_Communication#preferred() preferred} to preferred.
     * @param preferred The value for preferred
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal preferred(Optional<Boolean> preferred);

    /**
     * Builds a new {@link RelatedPerson_Communication RelatedPerson_Communication}.
     * @return An immutable instance of RelatedPerson_Communication
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    RelatedPerson_Communication build();
  }
}
