package com.medplum.types.fhir;

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
 * Immutable implementation of {@link Group_Member}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableGroup_Member.builder()}.
 */
@Generated(from = "Group_Member", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableGroup_Member implements Group_Member {
  private final Reference entity;
  private final @Nullable Boolean inactive;
  private final @Nullable List<Extension> extension;
  private final @Nullable Period period;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;

  private ImmutableGroup_Member(
      Reference entity,
      @Nullable Boolean inactive,
      @Nullable List<Extension> extension,
      @Nullable Period period,
      @Nullable List<Extension> modifierExtension,
      @Nullable String id) {
    this.entity = entity;
    this.inactive = inactive;
    this.extension = extension;
    this.period = period;
    this.modifierExtension = modifierExtension;
    this.id = id;
  }

  /**
   * @return The value of the {@code entity} attribute
   */
  @JsonProperty("entity")
  @Override
  public Reference entity() {
    return entity;
  }

  /**
   * @return The value of the {@code inactive} attribute
   */
  @JsonProperty("inactive")
  @Override
  public Optional<Boolean> inactive() {
    return Optional.ofNullable(inactive);
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
   * @return The value of the {@code period} attribute
   */
  @JsonProperty("period")
  @Override
  public Optional<Period> period() {
    return Optional.ofNullable(period);
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
   * Copy the current immutable object by setting a value for the {@link Group_Member#entity() entity} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for entity
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGroup_Member withEntity(Reference value) {
    if (this.entity == value) return this;
    Reference newValue = Objects.requireNonNull(value, "entity");
    return new ImmutableGroup_Member(newValue, this.inactive, this.extension, this.period, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group_Member#inactive() inactive} attribute.
   * @param value The value for inactive
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup_Member withInactive(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.inactive, newValue)) return this;
    return new ImmutableGroup_Member(this.entity, newValue, this.extension, this.period, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group_Member#inactive() inactive} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for inactive
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup_Member withInactive(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.inactive, value)) return this;
    return new ImmutableGroup_Member(this.entity, value, this.extension, this.period, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group_Member#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup_Member withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableGroup_Member(this.entity, this.inactive, newValue, this.period, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group_Member#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGroup_Member withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableGroup_Member(this.entity, this.inactive, value, this.period, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group_Member#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup_Member withPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableGroup_Member(this.entity, this.inactive, this.extension, newValue, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group_Member#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGroup_Member withPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableGroup_Member(this.entity, this.inactive, this.extension, value, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group_Member#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup_Member withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableGroup_Member(this.entity, this.inactive, this.extension, this.period, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group_Member#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGroup_Member withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableGroup_Member(this.entity, this.inactive, this.extension, this.period, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group_Member#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup_Member withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableGroup_Member(this.entity, this.inactive, this.extension, this.period, this.modifierExtension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group_Member#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup_Member withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableGroup_Member(this.entity, this.inactive, this.extension, this.period, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableGroup_Member} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableGroup_Member
        && equalTo((ImmutableGroup_Member) another);
  }

  private boolean equalTo(ImmutableGroup_Member another) {
    return entity.equals(another.entity)
        && Objects.equals(inactive, another.inactive)
        && Objects.equals(extension, another.extension)
        && Objects.equals(period, another.period)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code entity}, {@code inactive}, {@code extension}, {@code period}, {@code modifierExtension}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + entity.hashCode();
    h += (h << 5) + Objects.hashCode(inactive);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(period);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code Group_Member} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Group_Member{");
    builder.append("entity=").append(entity);
    if (inactive != null) {
      builder.append(", ");
      builder.append("inactive=").append(inactive);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (period != null) {
      builder.append(", ");
      builder.append("period=").append(period);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
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
  @Generated(from = "Group_Member", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Group_Member {
    @Nullable Reference entity;
    @Nullable Optional<Boolean> inactive = Optional.empty();
    boolean inactiveIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Period> period = Optional.empty();
    boolean periodIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("entity")
    public void setEntity(Reference entity) {
      this.entity = entity;
    }
    @JsonProperty("inactive")
    public void setInactive(Optional<Boolean> inactive) {
      this.inactive = inactive;
      this.inactiveIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("period")
    public void setPeriod(Optional<Period> period) {
      this.period = period;
      this.periodIsSet = true;
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
    public Reference entity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> inactive() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> period() { throw new UnsupportedOperationException(); }
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
  static ImmutableGroup_Member fromJson(Json json) {
    ImmutableGroup_Member.Builder builder = ((ImmutableGroup_Member.Builder) ImmutableGroup_Member.builder());
    if (json.entity != null) {
      builder.entity(json.entity);
    }
    if (json.inactiveIsSet) {
      builder.inactive(json.inactive);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableGroup_Member) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Group_Member} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Group_Member instance
   */
  public static Group_Member copyOf(Group_Member instance) {
    if (instance instanceof ImmutableGroup_Member) {
      return (ImmutableGroup_Member) instance;
    }
    return ((ImmutableGroup_Member.Builder) ImmutableGroup_Member.builder())
        .entity(instance.entity())
        .inactive(instance.inactive())
        .extension(instance.extension())
        .period(instance.period())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link Group_Member Group_Member}.
   * <pre>
   * ImmutableGroup_Member.builder()
   *    .entity(com.medplum.types.fhir.Reference) // required {@link Group_Member#entity() entity}
   *    .inactive(Boolean) // optional {@link Group_Member#inactive() inactive}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Group_Member#extension() extension}
   *    .period(com.medplum.types.fhir.Period) // optional {@link Group_Member#period() period}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Group_Member#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link Group_Member#id() id}
   *    .build();
   * </pre>
   * @return A new Group_Member builder
   */
  public static EntityBuildStage builder() {
    return new ImmutableGroup_Member.Builder();
  }

  /**
   * Builds instances of type {@link Group_Member Group_Member}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Group_Member", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements EntityBuildStage, BuildFinal {
    private static final long INIT_BIT_ENTITY = 0x1L;
    private static final long OPT_BIT_INACTIVE = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_PERIOD = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Reference entity;
    private @Nullable Boolean inactive;
    private @Nullable List<Extension> extension;
    private @Nullable Period period;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link Group_Member#entity() entity} attribute.
     * @param entity The value for entity 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entity")
    public final Builder entity(Reference entity) {
      checkNotIsSet(entityIsSet(), "entity");
      this.entity = Objects.requireNonNull(entity, "entity");
      initBits &= ~INIT_BIT_ENTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Group_Member#inactive() inactive} to inactive.
     * @param inactive The value for inactive
     * @return {@code this} builder for chained invocation
     */
    public final Builder inactive(boolean inactive) {
      checkNotIsSet(inactiveIsSet(), "inactive");
      this.inactive = inactive;
      optBits |= OPT_BIT_INACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link Group_Member#inactive() inactive} to inactive.
     * @param inactive The value for inactive
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("inactive")
    public final Builder inactive(Optional<Boolean> inactive) {
      checkNotIsSet(inactiveIsSet(), "inactive");
      this.inactive = inactive.orElse(null);
      optBits |= OPT_BIT_INACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link Group_Member#extension() extension} to extension.
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
     * Initializes the optional value {@link Group_Member#extension() extension} to extension.
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
     * Initializes the optional value {@link Group_Member#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    public final Builder period(Period period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = Objects.requireNonNull(period, "period");
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Group_Member#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("period")
    public final Builder period(Optional<? extends Period> period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = period.orElse(null);
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Group_Member#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Group_Member#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Group_Member#id() id} to id.
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
     * Initializes the optional value {@link Group_Member#id() id} to id.
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
     * Builds a new {@link Group_Member Group_Member}.
     * @return An immutable instance of Group_Member
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Group_Member build() {
      checkRequiredAttributes();
      return new ImmutableGroup_Member(entity, inactive, extension, period, modifierExtension, id);
    }

    private boolean inactiveIsSet() {
      return (optBits & OPT_BIT_INACTIVE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean entityIsSet() {
      return (initBits & INIT_BIT_ENTITY) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Group_Member is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!entityIsSet()) attributes.add("entity");
      return "Cannot build Group_Member, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Group_Member", generator = "Immutables")
  public interface EntityBuildStage {
    /**
     * Initializes the value for the {@link Group_Member#entity() entity} attribute.
     * @param entity The value for entity 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal entity(Reference entity);
  }

  @Generated(from = "Group_Member", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Group_Member#inactive() inactive} to inactive.
     * @param inactive The value for inactive
     * @return {@code this} builder for chained invocation
     */
    BuildFinal inactive(boolean inactive);

    /**
     * Initializes the optional value {@link Group_Member#inactive() inactive} to inactive.
     * @param inactive The value for inactive
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal inactive(Optional<Boolean> inactive);

    /**
     * Initializes the optional value {@link Group_Member#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Group_Member#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Group_Member#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    BuildFinal period(Period period);

    /**
     * Initializes the optional value {@link Group_Member#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal period(Optional<? extends Period> period);

    /**
     * Initializes the optional value {@link Group_Member#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Group_Member#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Group_Member#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link Group_Member#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Builds a new {@link Group_Member Group_Member}.
     * @return An immutable instance of Group_Member
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Group_Member build();
  }
}
