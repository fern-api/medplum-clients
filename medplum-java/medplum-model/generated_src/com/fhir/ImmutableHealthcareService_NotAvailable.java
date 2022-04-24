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
 * Immutable implementation of {@link HealthcareService_NotAvailable}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableHealthcareService_NotAvailable.builder()}.
 */
@Generated(from = "HealthcareService_NotAvailable", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableHealthcareService_NotAvailable implements HealthcareService_NotAvailable {
  private final @Nullable List<Extension> extension;
  private final @Nullable String description;
  private final @Nullable Period during;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;

  private ImmutableHealthcareService_NotAvailable(
      @Nullable List<Extension> extension,
      @Nullable String description,
      @Nullable Period during,
      @Nullable List<Extension> modifierExtension,
      @Nullable String id) {
    this.extension = extension;
    this.description = description;
    this.during = during;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService_NotAvailable#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService_NotAvailable withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableHealthcareService_NotAvailable(newValue, this.description, this.during, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService_NotAvailable#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService_NotAvailable withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableHealthcareService_NotAvailable(value, this.description, this.during, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService_NotAvailable#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService_NotAvailable withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableHealthcareService_NotAvailable(this.extension, newValue, this.during, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService_NotAvailable#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService_NotAvailable withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableHealthcareService_NotAvailable(this.extension, value, this.during, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService_NotAvailable#during() during} attribute.
   * @param value The value for during
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService_NotAvailable withDuring(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "during");
    if (this.during == newValue) return this;
    return new ImmutableHealthcareService_NotAvailable(this.extension, this.description, newValue, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService_NotAvailable#during() during} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for during
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService_NotAvailable withDuring(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.during == value) return this;
    return new ImmutableHealthcareService_NotAvailable(this.extension, this.description, value, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService_NotAvailable#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService_NotAvailable withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableHealthcareService_NotAvailable(this.extension, this.description, this.during, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService_NotAvailable#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService_NotAvailable withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableHealthcareService_NotAvailable(this.extension, this.description, this.during, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService_NotAvailable#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService_NotAvailable withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableHealthcareService_NotAvailable(this.extension, this.description, this.during, this.modifierExtension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService_NotAvailable#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService_NotAvailable withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableHealthcareService_NotAvailable(this.extension, this.description, this.during, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableHealthcareService_NotAvailable} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableHealthcareService_NotAvailable
        && equalTo((ImmutableHealthcareService_NotAvailable) another);
  }

  private boolean equalTo(ImmutableHealthcareService_NotAvailable another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(description, another.description)
        && Objects.equals(during, another.during)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code description}, {@code during}, {@code modifierExtension}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(during);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code HealthcareService_NotAvailable} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("HealthcareService_NotAvailable{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (description != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (during != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("during=").append(during);
    }
    if (modifierExtension != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "HealthcareService_NotAvailable", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements HealthcareService_NotAvailable {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<Period> during = Optional.empty();
    boolean duringIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("during")
    public void setDuring(Optional<Period> during) {
      this.during = during;
      this.duringIsSet = true;
    }
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
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> during() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
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
  static ImmutableHealthcareService_NotAvailable fromJson(Json json) {
    ImmutableHealthcareService_NotAvailable.Builder builder = ImmutableHealthcareService_NotAvailable.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.duringIsSet) {
      builder.during(json.during);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableHealthcareService_NotAvailable) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link HealthcareService_NotAvailable} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable HealthcareService_NotAvailable instance
   */
  public static HealthcareService_NotAvailable copyOf(HealthcareService_NotAvailable instance) {
    if (instance instanceof ImmutableHealthcareService_NotAvailable) {
      return (ImmutableHealthcareService_NotAvailable) instance;
    }
    return ImmutableHealthcareService_NotAvailable.builder()
        .extension(instance.extension())
        .description(instance.description())
        .during(instance.during())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link HealthcareService_NotAvailable HealthcareService_NotAvailable}.
   * <pre>
   * ImmutableHealthcareService_NotAvailable.builder()
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link HealthcareService_NotAvailable#extension() extension}
   *    .description(String) // optional {@link HealthcareService_NotAvailable#description() description}
   *    .during(com.fhir.Period) // optional {@link HealthcareService_NotAvailable#during() during}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link HealthcareService_NotAvailable#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link HealthcareService_NotAvailable#id() id}
   *    .build();
   * </pre>
   * @return A new HealthcareService_NotAvailable builder
   */
  public static ImmutableHealthcareService_NotAvailable.Builder builder() {
    return new ImmutableHealthcareService_NotAvailable.Builder();
  }

  /**
   * Builds instances of type {@link HealthcareService_NotAvailable HealthcareService_NotAvailable}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "HealthcareService_NotAvailable", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_DESCRIPTION = 0x2L;
    private static final long OPT_BIT_DURING = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable String description;
    private @Nullable Period during;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link HealthcareService_NotAvailable#extension() extension} to extension.
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
     * Initializes the optional value {@link HealthcareService_NotAvailable#extension() extension} to extension.
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
     * Initializes the optional value {@link HealthcareService_NotAvailable#description() description} to description.
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
     * Initializes the optional value {@link HealthcareService_NotAvailable#description() description} to description.
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
     * Initializes the optional value {@link HealthcareService_NotAvailable#during() during} to during.
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
     * Initializes the optional value {@link HealthcareService_NotAvailable#during() during} to during.
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
     * Initializes the optional value {@link HealthcareService_NotAvailable#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link HealthcareService_NotAvailable#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link HealthcareService_NotAvailable#id() id} to id.
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
     * Initializes the optional value {@link HealthcareService_NotAvailable#id() id} to id.
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
     * Builds a new {@link HealthcareService_NotAvailable HealthcareService_NotAvailable}.
     * @return An immutable instance of HealthcareService_NotAvailable
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public HealthcareService_NotAvailable build() {
      return new ImmutableHealthcareService_NotAvailable(extension, description, during, modifierExtension, id);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean duringIsSet() {
      return (optBits & OPT_BIT_DURING) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of HealthcareService_NotAvailable is strict, attribute is already set: ".concat(name));
    }
  }
}
