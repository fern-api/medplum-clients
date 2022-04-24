package com.fhir;

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
 * Immutable implementation of {@link EffectEvidenceSynthesis_SampleSize}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEffectEvidenceSynthesis_SampleSize.builder()}.
 */
@Generated(from = "EffectEvidenceSynthesis_SampleSize", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableEffectEvidenceSynthesis_SampleSize
    implements EffectEvidenceSynthesis_SampleSize {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Integer numberOfStudies;
  private final @Nullable String description;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable Integer numberOfParticipants;

  private ImmutableEffectEvidenceSynthesis_SampleSize(
      @Nullable List<Extension> modifierExtension,
      @Nullable Integer numberOfStudies,
      @Nullable String description,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable Integer numberOfParticipants) {
    this.modifierExtension = modifierExtension;
    this.numberOfStudies = numberOfStudies;
    this.description = description;
    this.id = id;
    this.extension = extension;
    this.numberOfParticipants = numberOfParticipants;
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
   * @return The value of the {@code numberOfStudies} attribute
   */
  @JsonProperty("numberOfStudies")
  @Override
  public Optional<Integer> numberOfStudies() {
    return Optional.ofNullable(numberOfStudies);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
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
   * @return The value of the {@code numberOfParticipants} attribute
   */
  @JsonProperty("numberOfParticipants")
  @Override
  public Optional<Integer> numberOfParticipants() {
    return Optional.ofNullable(numberOfParticipants);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis_SampleSize#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_SampleSize withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis_SampleSize(
        newValue,
        this.numberOfStudies,
        this.description,
        this.id,
        this.extension,
        this.numberOfParticipants);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis_SampleSize#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis_SampleSize withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableEffectEvidenceSynthesis_SampleSize(
        value,
        this.numberOfStudies,
        this.description,
        this.id,
        this.extension,
        this.numberOfParticipants);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis_SampleSize#numberOfStudies() numberOfStudies} attribute.
   * @param value The value for numberOfStudies
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_SampleSize withNumberOfStudies(int value) {
    @Nullable Integer newValue = value;
    if (Objects.equals(this.numberOfStudies, newValue)) return this;
    return new ImmutableEffectEvidenceSynthesis_SampleSize(
        this.modifierExtension,
        newValue,
        this.description,
        this.id,
        this.extension,
        this.numberOfParticipants);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis_SampleSize#numberOfStudies() numberOfStudies} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for numberOfStudies
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_SampleSize withNumberOfStudies(Optional<Integer> optional) {
    @Nullable Integer value = optional.orElse(null);
    if (Objects.equals(this.numberOfStudies, value)) return this;
    return new ImmutableEffectEvidenceSynthesis_SampleSize(
        this.modifierExtension,
        value,
        this.description,
        this.id,
        this.extension,
        this.numberOfParticipants);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis_SampleSize#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_SampleSize withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableEffectEvidenceSynthesis_SampleSize(
        this.modifierExtension,
        this.numberOfStudies,
        newValue,
        this.id,
        this.extension,
        this.numberOfParticipants);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis_SampleSize#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_SampleSize withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableEffectEvidenceSynthesis_SampleSize(
        this.modifierExtension,
        this.numberOfStudies,
        value,
        this.id,
        this.extension,
        this.numberOfParticipants);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis_SampleSize#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_SampleSize withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableEffectEvidenceSynthesis_SampleSize(
        this.modifierExtension,
        this.numberOfStudies,
        this.description,
        newValue,
        this.extension,
        this.numberOfParticipants);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis_SampleSize#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_SampleSize withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableEffectEvidenceSynthesis_SampleSize(
        this.modifierExtension,
        this.numberOfStudies,
        this.description,
        value,
        this.extension,
        this.numberOfParticipants);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis_SampleSize#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_SampleSize withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis_SampleSize(
        this.modifierExtension,
        this.numberOfStudies,
        this.description,
        this.id,
        newValue,
        this.numberOfParticipants);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis_SampleSize#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis_SampleSize withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableEffectEvidenceSynthesis_SampleSize(
        this.modifierExtension,
        this.numberOfStudies,
        this.description,
        this.id,
        value,
        this.numberOfParticipants);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis_SampleSize#numberOfParticipants() numberOfParticipants} attribute.
   * @param value The value for numberOfParticipants
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_SampleSize withNumberOfParticipants(int value) {
    @Nullable Integer newValue = value;
    if (Objects.equals(this.numberOfParticipants, newValue)) return this;
    return new ImmutableEffectEvidenceSynthesis_SampleSize(
        this.modifierExtension,
        this.numberOfStudies,
        this.description,
        this.id,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis_SampleSize#numberOfParticipants() numberOfParticipants} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for numberOfParticipants
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_SampleSize withNumberOfParticipants(Optional<Integer> optional) {
    @Nullable Integer value = optional.orElse(null);
    if (Objects.equals(this.numberOfParticipants, value)) return this;
    return new ImmutableEffectEvidenceSynthesis_SampleSize(this.modifierExtension, this.numberOfStudies, this.description, this.id, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEffectEvidenceSynthesis_SampleSize} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEffectEvidenceSynthesis_SampleSize
        && equalTo((ImmutableEffectEvidenceSynthesis_SampleSize) another);
  }

  private boolean equalTo(ImmutableEffectEvidenceSynthesis_SampleSize another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(numberOfStudies, another.numberOfStudies)
        && Objects.equals(description, another.description)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(numberOfParticipants, another.numberOfParticipants);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code numberOfStudies}, {@code description}, {@code id}, {@code extension}, {@code numberOfParticipants}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(numberOfStudies);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(numberOfParticipants);
    return h;
  }

  /**
   * Prints the immutable value {@code EffectEvidenceSynthesis_SampleSize} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("EffectEvidenceSynthesis_SampleSize{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (numberOfStudies != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("numberOfStudies=").append(numberOfStudies);
    }
    if (description != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (id != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (numberOfParticipants != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("numberOfParticipants=").append(numberOfParticipants);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "EffectEvidenceSynthesis_SampleSize", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements EffectEvidenceSynthesis_SampleSize {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Integer> numberOfStudies = Optional.empty();
    boolean numberOfStudiesIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Integer> numberOfParticipants = Optional.empty();
    boolean numberOfParticipantsIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("numberOfStudies")
    public void setNumberOfStudies(Optional<Integer> numberOfStudies) {
      this.numberOfStudies = numberOfStudies;
      this.numberOfStudiesIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
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
    @JsonProperty("numberOfParticipants")
    public void setNumberOfParticipants(Optional<Integer> numberOfParticipants) {
      this.numberOfParticipants = numberOfParticipants;
      this.numberOfParticipantsIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Integer> numberOfStudies() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Integer> numberOfParticipants() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEffectEvidenceSynthesis_SampleSize fromJson(Json json) {
    ImmutableEffectEvidenceSynthesis_SampleSize.Builder builder = ImmutableEffectEvidenceSynthesis_SampleSize.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.numberOfStudiesIsSet) {
      builder.numberOfStudies(json.numberOfStudies);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.numberOfParticipantsIsSet) {
      builder.numberOfParticipants(json.numberOfParticipants);
    }
    return (ImmutableEffectEvidenceSynthesis_SampleSize) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link EffectEvidenceSynthesis_SampleSize} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EffectEvidenceSynthesis_SampleSize instance
   */
  public static EffectEvidenceSynthesis_SampleSize copyOf(EffectEvidenceSynthesis_SampleSize instance) {
    if (instance instanceof ImmutableEffectEvidenceSynthesis_SampleSize) {
      return (ImmutableEffectEvidenceSynthesis_SampleSize) instance;
    }
    return ImmutableEffectEvidenceSynthesis_SampleSize.builder()
        .modifierExtension(instance.modifierExtension())
        .numberOfStudies(instance.numberOfStudies())
        .description(instance.description())
        .id(instance.id())
        .extension(instance.extension())
        .numberOfParticipants(instance.numberOfParticipants())
        .build();
  }

  /**
   * Creates a builder for {@link EffectEvidenceSynthesis_SampleSize EffectEvidenceSynthesis_SampleSize}.
   * <pre>
   * ImmutableEffectEvidenceSynthesis_SampleSize.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link EffectEvidenceSynthesis_SampleSize#modifierExtension() modifierExtension}
   *    .numberOfStudies(Integer) // optional {@link EffectEvidenceSynthesis_SampleSize#numberOfStudies() numberOfStudies}
   *    .description(String) // optional {@link EffectEvidenceSynthesis_SampleSize#description() description}
   *    .id(String) // optional {@link EffectEvidenceSynthesis_SampleSize#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link EffectEvidenceSynthesis_SampleSize#extension() extension}
   *    .numberOfParticipants(Integer) // optional {@link EffectEvidenceSynthesis_SampleSize#numberOfParticipants() numberOfParticipants}
   *    .build();
   * </pre>
   * @return A new EffectEvidenceSynthesis_SampleSize builder
   */
  public static ImmutableEffectEvidenceSynthesis_SampleSize.Builder builder() {
    return new ImmutableEffectEvidenceSynthesis_SampleSize.Builder();
  }

  /**
   * Builds instances of type {@link EffectEvidenceSynthesis_SampleSize EffectEvidenceSynthesis_SampleSize}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "EffectEvidenceSynthesis_SampleSize", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_NUMBER_OF_STUDIES = 0x2L;
    private static final long OPT_BIT_DESCRIPTION = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_NUMBER_OF_PARTICIPANTS = 0x20L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable Integer numberOfStudies;
    private @Nullable String description;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable Integer numberOfParticipants;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis_SampleSize#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_SampleSize#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_SampleSize#numberOfStudies() numberOfStudies} to numberOfStudies.
     * @param numberOfStudies The value for numberOfStudies
     * @return {@code this} builder for chained invocation
     */
    public final Builder numberOfStudies(int numberOfStudies) {
      checkNotIsSet(numberOfStudiesIsSet(), "numberOfStudies");
      this.numberOfStudies = numberOfStudies;
      optBits |= OPT_BIT_NUMBER_OF_STUDIES;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis_SampleSize#numberOfStudies() numberOfStudies} to numberOfStudies.
     * @param numberOfStudies The value for numberOfStudies
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("numberOfStudies")
    public final Builder numberOfStudies(Optional<Integer> numberOfStudies) {
      checkNotIsSet(numberOfStudiesIsSet(), "numberOfStudies");
      this.numberOfStudies = numberOfStudies.orElse(null);
      optBits |= OPT_BIT_NUMBER_OF_STUDIES;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis_SampleSize#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis_SampleSize#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(Optional<String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis_SampleSize#id() id} to id.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_SampleSize#id() id} to id.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_SampleSize#extension() extension} to extension.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_SampleSize#extension() extension} to extension.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_SampleSize#numberOfParticipants() numberOfParticipants} to numberOfParticipants.
     * @param numberOfParticipants The value for numberOfParticipants
     * @return {@code this} builder for chained invocation
     */
    public final Builder numberOfParticipants(int numberOfParticipants) {
      checkNotIsSet(numberOfParticipantsIsSet(), "numberOfParticipants");
      this.numberOfParticipants = numberOfParticipants;
      optBits |= OPT_BIT_NUMBER_OF_PARTICIPANTS;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis_SampleSize#numberOfParticipants() numberOfParticipants} to numberOfParticipants.
     * @param numberOfParticipants The value for numberOfParticipants
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("numberOfParticipants")
    public final Builder numberOfParticipants(Optional<Integer> numberOfParticipants) {
      checkNotIsSet(numberOfParticipantsIsSet(), "numberOfParticipants");
      this.numberOfParticipants = numberOfParticipants.orElse(null);
      optBits |= OPT_BIT_NUMBER_OF_PARTICIPANTS;
      return this;
    }

    /**
     * Builds a new {@link EffectEvidenceSynthesis_SampleSize EffectEvidenceSynthesis_SampleSize}.
     * @return An immutable instance of EffectEvidenceSynthesis_SampleSize
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public EffectEvidenceSynthesis_SampleSize build() {
      return new ImmutableEffectEvidenceSynthesis_SampleSize(modifierExtension, numberOfStudies, description, id, extension, numberOfParticipants);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean numberOfStudiesIsSet() {
      return (optBits & OPT_BIT_NUMBER_OF_STUDIES) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean numberOfParticipantsIsSet() {
      return (optBits & OPT_BIT_NUMBER_OF_PARTICIPANTS) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of EffectEvidenceSynthesis_SampleSize is strict, attribute is already set: ".concat(name));
    }
  }
}
