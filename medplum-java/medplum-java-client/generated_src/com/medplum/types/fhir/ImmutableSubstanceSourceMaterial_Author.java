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
 * Immutable implementation of {@link SubstanceSourceMaterial_Author}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstanceSourceMaterial_Author.builder()}.
 */
@Generated(from = "SubstanceSourceMaterial_Author", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstanceSourceMaterial_Author
    implements SubstanceSourceMaterial_Author {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final @Nullable String authorDescription;
  private final @Nullable List<Extension> extension;
  private final @Nullable CodeableConcept authorType;

  private ImmutableSubstanceSourceMaterial_Author(
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      @Nullable String authorDescription,
      @Nullable List<Extension> extension,
      @Nullable CodeableConcept authorType) {
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.authorDescription = authorDescription;
    this.extension = extension;
    this.authorType = authorType;
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
   * @return The value of the {@code authorDescription} attribute
   */
  @JsonProperty("authorDescription")
  @Override
  public Optional<String> authorDescription() {
    return Optional.ofNullable(authorDescription);
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
   * @return The value of the {@code authorType} attribute
   */
  @JsonProperty("authorType")
  @Override
  public Optional<CodeableConcept> authorType() {
    return Optional.ofNullable(authorType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_Author#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_Author withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstanceSourceMaterial_Author(newValue, this.id, this.authorDescription, this.extension, this.authorType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_Author#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial_Author withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstanceSourceMaterial_Author(value, this.id, this.authorDescription, this.extension, this.authorType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_Author#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_Author withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSubstanceSourceMaterial_Author(this.modifierExtension, newValue, this.authorDescription, this.extension, this.authorType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_Author#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_Author withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSubstanceSourceMaterial_Author(this.modifierExtension, value, this.authorDescription, this.extension, this.authorType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_Author#authorDescription() authorDescription} attribute.
   * @param value The value for authorDescription
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_Author withAuthorDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "authorDescription");
    if (Objects.equals(this.authorDescription, newValue)) return this;
    return new ImmutableSubstanceSourceMaterial_Author(this.modifierExtension, this.id, newValue, this.extension, this.authorType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_Author#authorDescription() authorDescription} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authorDescription
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_Author withAuthorDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.authorDescription, value)) return this;
    return new ImmutableSubstanceSourceMaterial_Author(this.modifierExtension, this.id, value, this.extension, this.authorType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_Author#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_Author withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstanceSourceMaterial_Author(this.modifierExtension, this.id, this.authorDescription, newValue, this.authorType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_Author#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial_Author withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstanceSourceMaterial_Author(this.modifierExtension, this.id, this.authorDescription, value, this.authorType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_Author#authorType() authorType} attribute.
   * @param value The value for authorType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_Author withAuthorType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "authorType");
    if (this.authorType == newValue) return this;
    return new ImmutableSubstanceSourceMaterial_Author(this.modifierExtension, this.id, this.authorDescription, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_Author#authorType() authorType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authorType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial_Author withAuthorType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.authorType == value) return this;
    return new ImmutableSubstanceSourceMaterial_Author(this.modifierExtension, this.id, this.authorDescription, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstanceSourceMaterial_Author} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstanceSourceMaterial_Author
        && equalTo((ImmutableSubstanceSourceMaterial_Author) another);
  }

  private boolean equalTo(ImmutableSubstanceSourceMaterial_Author another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(authorDescription, another.authorDescription)
        && Objects.equals(extension, another.extension)
        && Objects.equals(authorType, another.authorType);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code id}, {@code authorDescription}, {@code extension}, {@code authorType}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(authorDescription);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(authorType);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstanceSourceMaterial_Author} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SubstanceSourceMaterial_Author{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (authorDescription != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("authorDescription=").append(authorDescription);
    }
    if (extension != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (authorType != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("authorType=").append(authorType);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SubstanceSourceMaterial_Author", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SubstanceSourceMaterial_Author {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> authorDescription = Optional.empty();
    boolean authorDescriptionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<CodeableConcept> authorType = Optional.empty();
    boolean authorTypeIsSet;
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
    @JsonProperty("authorDescription")
    public void setAuthorDescription(Optional<String> authorDescription) {
      this.authorDescription = authorDescription;
      this.authorDescriptionIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("authorType")
    public void setAuthorType(Optional<CodeableConcept> authorType) {
      this.authorType = authorType;
      this.authorTypeIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> authorDescription() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> authorType() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSubstanceSourceMaterial_Author fromJson(Json json) {
    ImmutableSubstanceSourceMaterial_Author.Builder builder = ImmutableSubstanceSourceMaterial_Author.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.authorDescriptionIsSet) {
      builder.authorDescription(json.authorDescription);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.authorTypeIsSet) {
      builder.authorType(json.authorType);
    }
    return (ImmutableSubstanceSourceMaterial_Author) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubstanceSourceMaterial_Author} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubstanceSourceMaterial_Author instance
   */
  public static SubstanceSourceMaterial_Author copyOf(SubstanceSourceMaterial_Author instance) {
    if (instance instanceof ImmutableSubstanceSourceMaterial_Author) {
      return (ImmutableSubstanceSourceMaterial_Author) instance;
    }
    return ImmutableSubstanceSourceMaterial_Author.builder()
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .authorDescription(instance.authorDescription())
        .extension(instance.extension())
        .authorType(instance.authorType())
        .build();
  }

  /**
   * Creates a builder for {@link SubstanceSourceMaterial_Author SubstanceSourceMaterial_Author}.
   * <pre>
   * ImmutableSubstanceSourceMaterial_Author.builder()
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link SubstanceSourceMaterial_Author#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link SubstanceSourceMaterial_Author#id() id}
   *    .authorDescription(String) // optional {@link SubstanceSourceMaterial_Author#authorDescription() authorDescription}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link SubstanceSourceMaterial_Author#extension() extension}
   *    .authorType(com.medplum.types.fhir.CodeableConcept) // optional {@link SubstanceSourceMaterial_Author#authorType() authorType}
   *    .build();
   * </pre>
   * @return A new SubstanceSourceMaterial_Author builder
   */
  public static ImmutableSubstanceSourceMaterial_Author.Builder builder() {
    return new ImmutableSubstanceSourceMaterial_Author.Builder();
  }

  /**
   * Builds instances of type {@link SubstanceSourceMaterial_Author SubstanceSourceMaterial_Author}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SubstanceSourceMaterial_Author", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_AUTHOR_DESCRIPTION = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_AUTHOR_TYPE = 0x10L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable String authorDescription;
    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept authorType;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_Author#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceSourceMaterial_Author#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceSourceMaterial_Author#id() id} to id.
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
     * Initializes the optional value {@link SubstanceSourceMaterial_Author#id() id} to id.
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
     * Initializes the optional value {@link SubstanceSourceMaterial_Author#authorDescription() authorDescription} to authorDescription.
     * @param authorDescription The value for authorDescription
     * @return {@code this} builder for chained invocation
     */
    public final Builder authorDescription(String authorDescription) {
      checkNotIsSet(authorDescriptionIsSet(), "authorDescription");
      this.authorDescription = Objects.requireNonNull(authorDescription, "authorDescription");
      optBits |= OPT_BIT_AUTHOR_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_Author#authorDescription() authorDescription} to authorDescription.
     * @param authorDescription The value for authorDescription
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("authorDescription")
    public final Builder authorDescription(Optional<String> authorDescription) {
      checkNotIsSet(authorDescriptionIsSet(), "authorDescription");
      this.authorDescription = authorDescription.orElse(null);
      optBits |= OPT_BIT_AUTHOR_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_Author#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceSourceMaterial_Author#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceSourceMaterial_Author#authorType() authorType} to authorType.
     * @param authorType The value for authorType
     * @return {@code this} builder for chained invocation
     */
    public final Builder authorType(CodeableConcept authorType) {
      checkNotIsSet(authorTypeIsSet(), "authorType");
      this.authorType = Objects.requireNonNull(authorType, "authorType");
      optBits |= OPT_BIT_AUTHOR_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_Author#authorType() authorType} to authorType.
     * @param authorType The value for authorType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("authorType")
    public final Builder authorType(Optional<? extends CodeableConcept> authorType) {
      checkNotIsSet(authorTypeIsSet(), "authorType");
      this.authorType = authorType.orElse(null);
      optBits |= OPT_BIT_AUTHOR_TYPE;
      return this;
    }

    /**
     * Builds a new {@link SubstanceSourceMaterial_Author SubstanceSourceMaterial_Author}.
     * @return An immutable instance of SubstanceSourceMaterial_Author
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SubstanceSourceMaterial_Author build() {
      return new ImmutableSubstanceSourceMaterial_Author(modifierExtension, id, authorDescription, extension, authorType);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean authorDescriptionIsSet() {
      return (optBits & OPT_BIT_AUTHOR_DESCRIPTION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean authorTypeIsSet() {
      return (optBits & OPT_BIT_AUTHOR_TYPE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SubstanceSourceMaterial_Author is strict, attribute is already set: ".concat(name));
    }
  }
}
