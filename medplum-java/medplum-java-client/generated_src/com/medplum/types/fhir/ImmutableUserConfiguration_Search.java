package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link UserConfiguration_Search}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableUserConfiguration_Search.builder()}.
 */
@Generated(from = "UserConfiguration_Search", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableUserConfiguration_Search
    implements UserConfiguration_Search {
  private final @Nullable String name;
  private final @Nullable String criteria;

  private ImmutableUserConfiguration_Search(
      @Nullable String name,
      @Nullable String criteria) {
    this.name = name;
    this.criteria = criteria;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code criteria} attribute
   */
  @JsonProperty("criteria")
  @Override
  public Optional<String> criteria() {
    return Optional.ofNullable(criteria);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UserConfiguration_Search#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration_Search withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableUserConfiguration_Search(newValue, this.criteria);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UserConfiguration_Search#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration_Search withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableUserConfiguration_Search(value, this.criteria);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UserConfiguration_Search#criteria() criteria} attribute.
   * @param value The value for criteria
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration_Search withCriteria(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "criteria");
    if (Objects.equals(this.criteria, newValue)) return this;
    return new ImmutableUserConfiguration_Search(this.name, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UserConfiguration_Search#criteria() criteria} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for criteria
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration_Search withCriteria(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.criteria, value)) return this;
    return new ImmutableUserConfiguration_Search(this.name, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableUserConfiguration_Search} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableUserConfiguration_Search
        && equalTo((ImmutableUserConfiguration_Search) another);
  }

  private boolean equalTo(ImmutableUserConfiguration_Search another) {
    return Objects.equals(name, another.name)
        && Objects.equals(criteria, another.criteria);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code criteria}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(criteria);
    return h;
  }

  /**
   * Prints the immutable value {@code UserConfiguration_Search} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("UserConfiguration_Search{");
    if (name != null) {
      builder.append("name=").append(name);
    }
    if (criteria != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("criteria=").append(criteria);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "UserConfiguration_Search", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements UserConfiguration_Search {
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<String> criteria = Optional.empty();
    boolean criteriaIsSet;
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("criteria")
    public void setCriteria(Optional<String> criteria) {
      this.criteria = criteria;
      this.criteriaIsSet = true;
    }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> criteria() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableUserConfiguration_Search fromJson(Json json) {
    ImmutableUserConfiguration_Search.Builder builder = ImmutableUserConfiguration_Search.builder();
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.criteriaIsSet) {
      builder.criteria(json.criteria);
    }
    return (ImmutableUserConfiguration_Search) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link UserConfiguration_Search} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable UserConfiguration_Search instance
   */
  public static UserConfiguration_Search copyOf(UserConfiguration_Search instance) {
    if (instance instanceof ImmutableUserConfiguration_Search) {
      return (ImmutableUserConfiguration_Search) instance;
    }
    return ImmutableUserConfiguration_Search.builder()
        .name(instance.name())
        .criteria(instance.criteria())
        .build();
  }

  /**
   * Creates a builder for {@link UserConfiguration_Search UserConfiguration_Search}.
   * <pre>
   * ImmutableUserConfiguration_Search.builder()
   *    .name(String) // optional {@link UserConfiguration_Search#name() name}
   *    .criteria(String) // optional {@link UserConfiguration_Search#criteria() criteria}
   *    .build();
   * </pre>
   * @return A new UserConfiguration_Search builder
   */
  public static ImmutableUserConfiguration_Search.Builder builder() {
    return new ImmutableUserConfiguration_Search.Builder();
  }

  /**
   * Builds instances of type {@link UserConfiguration_Search UserConfiguration_Search}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "UserConfiguration_Search", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_NAME = 0x1L;
    private static final long OPT_BIT_CRITERIA = 0x2L;
    private long optBits;

    private @Nullable String name;
    private @Nullable String criteria;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link UserConfiguration_Search#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration_Search#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(Optional<String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration_Search#criteria() criteria} to criteria.
     * @param criteria The value for criteria
     * @return {@code this} builder for chained invocation
     */
    public final Builder criteria(String criteria) {
      checkNotIsSet(criteriaIsSet(), "criteria");
      this.criteria = Objects.requireNonNull(criteria, "criteria");
      optBits |= OPT_BIT_CRITERIA;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration_Search#criteria() criteria} to criteria.
     * @param criteria The value for criteria
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("criteria")
    public final Builder criteria(Optional<String> criteria) {
      checkNotIsSet(criteriaIsSet(), "criteria");
      this.criteria = criteria.orElse(null);
      optBits |= OPT_BIT_CRITERIA;
      return this;
    }

    /**
     * Builds a new {@link UserConfiguration_Search UserConfiguration_Search}.
     * @return An immutable instance of UserConfiguration_Search
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public UserConfiguration_Search build() {
      return new ImmutableUserConfiguration_Search(name, criteria);
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean criteriaIsSet() {
      return (optBits & OPT_BIT_CRITERIA) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of UserConfiguration_Search is strict, attribute is already set: ".concat(name));
    }
  }
}
