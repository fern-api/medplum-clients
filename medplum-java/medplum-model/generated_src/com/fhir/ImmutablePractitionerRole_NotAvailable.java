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
 * Immutable implementation of {@link PractitionerRole_NotAvailable}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePractitionerRole_NotAvailable.builder()}.
 */
@Generated(from = "PractitionerRole_NotAvailable", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutablePractitionerRole_NotAvailable implements PractitionerRole_NotAvailable {
  private final @Nullable Period during;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String description;

  private ImmutablePractitionerRole_NotAvailable(
      @Nullable Period during,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable String description) {
    this.during = during;
    this.id = id;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.description = description;
  }

  /**
   * @return The value of the {@code during} attribute
   */
  @JsonProperty("during")
  @Override
  public Optional<Period> during() {
    return Optional.ofNullable(during);
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole_NotAvailable#during() during} attribute.
   * @param value The value for during
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole_NotAvailable withDuring(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "during");
    if (this.during == newValue) return this;
    return new ImmutablePractitionerRole_NotAvailable(newValue, this.id, this.extension, this.modifierExtension, this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole_NotAvailable#during() during} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for during
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole_NotAvailable withDuring(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.during == value) return this;
    return new ImmutablePractitionerRole_NotAvailable(value, this.id, this.extension, this.modifierExtension, this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole_NotAvailable#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole_NotAvailable withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutablePractitionerRole_NotAvailable(this.during, newValue, this.extension, this.modifierExtension, this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole_NotAvailable#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole_NotAvailable withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutablePractitionerRole_NotAvailable(this.during, value, this.extension, this.modifierExtension, this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole_NotAvailable#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole_NotAvailable withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutablePractitionerRole_NotAvailable(this.during, this.id, newValue, this.modifierExtension, this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole_NotAvailable#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole_NotAvailable withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutablePractitionerRole_NotAvailable(this.during, this.id, value, this.modifierExtension, this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole_NotAvailable#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole_NotAvailable withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutablePractitionerRole_NotAvailable(this.during, this.id, this.extension, newValue, this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole_NotAvailable#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitionerRole_NotAvailable withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutablePractitionerRole_NotAvailable(this.during, this.id, this.extension, value, this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PractitionerRole_NotAvailable#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole_NotAvailable withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutablePractitionerRole_NotAvailable(this.during, this.id, this.extension, this.modifierExtension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PractitionerRole_NotAvailable#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitionerRole_NotAvailable withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutablePractitionerRole_NotAvailable(this.during, this.id, this.extension, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePractitionerRole_NotAvailable} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePractitionerRole_NotAvailable
        && equalTo((ImmutablePractitionerRole_NotAvailable) another);
  }

  private boolean equalTo(ImmutablePractitionerRole_NotAvailable another) {
    return Objects.equals(during, another.during)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code during}, {@code id}, {@code extension}, {@code modifierExtension}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(during);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code PractitionerRole_NotAvailable} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("PractitionerRole_NotAvailable{");
    if (during != null) {
      builder.append("during=").append(during);
    }
    if (id != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (description != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("description=").append(description);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "PractitionerRole_NotAvailable", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements PractitionerRole_NotAvailable {
    @Nullable Optional<Period> during = Optional.empty();
    boolean duringIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @JsonProperty("during")
    public void setDuring(Optional<Period> during) {
      this.during = during;
      this.duringIsSet = true;
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
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @Override
    public Optional<Period> during() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePractitionerRole_NotAvailable fromJson(Json json) {
    ImmutablePractitionerRole_NotAvailable.Builder builder = ImmutablePractitionerRole_NotAvailable.builder();
    if (json.duringIsSet) {
      builder.during(json.during);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    return (ImmutablePractitionerRole_NotAvailable) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PractitionerRole_NotAvailable} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PractitionerRole_NotAvailable instance
   */
  public static PractitionerRole_NotAvailable copyOf(PractitionerRole_NotAvailable instance) {
    if (instance instanceof ImmutablePractitionerRole_NotAvailable) {
      return (ImmutablePractitionerRole_NotAvailable) instance;
    }
    return ImmutablePractitionerRole_NotAvailable.builder()
        .during(instance.during())
        .id(instance.id())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .description(instance.description())
        .build();
  }

  /**
   * Creates a builder for {@link PractitionerRole_NotAvailable PractitionerRole_NotAvailable}.
   * <pre>
   * ImmutablePractitionerRole_NotAvailable.builder()
   *    .during(com.fhir.Period) // optional {@link PractitionerRole_NotAvailable#during() during}
   *    .id(String) // optional {@link PractitionerRole_NotAvailable#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link PractitionerRole_NotAvailable#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link PractitionerRole_NotAvailable#modifierExtension() modifierExtension}
   *    .description(String) // optional {@link PractitionerRole_NotAvailable#description() description}
   *    .build();
   * </pre>
   * @return A new PractitionerRole_NotAvailable builder
   */
  public static ImmutablePractitionerRole_NotAvailable.Builder builder() {
    return new ImmutablePractitionerRole_NotAvailable.Builder();
  }

  /**
   * Builds instances of type {@link PractitionerRole_NotAvailable PractitionerRole_NotAvailable}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "PractitionerRole_NotAvailable", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_DURING = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_DESCRIPTION = 0x10L;
    private long optBits;

    private @Nullable Period during;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String description;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link PractitionerRole_NotAvailable#during() during} to during.
     * @param during The value for during
     * @return {@code this} builder for chained invocation
     */
    public final Builder during(Period during) {
      checkNotIsSet(duringIsSet(), "during");
      this.during = Objects.requireNonNull(during, "during");
      optBits |= OPT_BIT_DURING;
      return this;
    }

    /**
     * Initializes the optional value {@link PractitionerRole_NotAvailable#during() during} to during.
     * @param during The value for during
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("during")
    public final Builder during(Optional<? extends Period> during) {
      checkNotIsSet(duringIsSet(), "during");
      this.during = during.orElse(null);
      optBits |= OPT_BIT_DURING;
      return this;
    }

    /**
     * Initializes the optional value {@link PractitionerRole_NotAvailable#id() id} to id.
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
     * Initializes the optional value {@link PractitionerRole_NotAvailable#id() id} to id.
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
     * Initializes the optional value {@link PractitionerRole_NotAvailable#extension() extension} to extension.
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
     * Initializes the optional value {@link PractitionerRole_NotAvailable#extension() extension} to extension.
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
     * Initializes the optional value {@link PractitionerRole_NotAvailable#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PractitionerRole_NotAvailable#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PractitionerRole_NotAvailable#description() description} to description.
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
     * Initializes the optional value {@link PractitionerRole_NotAvailable#description() description} to description.
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
     * Builds a new {@link PractitionerRole_NotAvailable PractitionerRole_NotAvailable}.
     * @return An immutable instance of PractitionerRole_NotAvailable
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public PractitionerRole_NotAvailable build() {
      return new ImmutablePractitionerRole_NotAvailable(during, id, extension, modifierExtension, description);
    }

    private boolean duringIsSet() {
      return (optBits & OPT_BIT_DURING) != 0;
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

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of PractitionerRole_NotAvailable is strict, attribute is already set: ".concat(name));
    }
  }
}
