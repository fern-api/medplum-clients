package com.fhir.types.fhir;

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
 * Immutable implementation of {@link UserConfiguration_Menu_Link}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableUserConfiguration_Menu_Link.builder()}.
 */
@Generated(from = "UserConfiguration_Menu_Link", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableUserConfiguration_Menu_Link
    implements UserConfiguration_Menu_Link {
  private final @Nullable String name;
  private final @Nullable String target;

  private ImmutableUserConfiguration_Menu_Link(
      @Nullable String name,
      @Nullable String target) {
    this.name = name;
    this.target = target;
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
   * @return The value of the {@code target} attribute
   */
  @JsonProperty("target")
  @Override
  public Optional<String> target() {
    return Optional.ofNullable(target);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UserConfiguration_Menu_Link#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration_Menu_Link withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableUserConfiguration_Menu_Link(newValue, this.target);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UserConfiguration_Menu_Link#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration_Menu_Link withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableUserConfiguration_Menu_Link(value, this.target);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UserConfiguration_Menu_Link#target() target} attribute.
   * @param value The value for target
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration_Menu_Link withTarget(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "target");
    if (Objects.equals(this.target, newValue)) return this;
    return new ImmutableUserConfiguration_Menu_Link(this.name, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UserConfiguration_Menu_Link#target() target} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for target
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration_Menu_Link withTarget(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.target, value)) return this;
    return new ImmutableUserConfiguration_Menu_Link(this.name, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableUserConfiguration_Menu_Link} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableUserConfiguration_Menu_Link
        && equalTo((ImmutableUserConfiguration_Menu_Link) another);
  }

  private boolean equalTo(ImmutableUserConfiguration_Menu_Link another) {
    return Objects.equals(name, another.name)
        && Objects.equals(target, another.target);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code target}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(target);
    return h;
  }

  /**
   * Prints the immutable value {@code UserConfiguration_Menu_Link} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("UserConfiguration_Menu_Link{");
    if (name != null) {
      builder.append("name=").append(name);
    }
    if (target != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("target=").append(target);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "UserConfiguration_Menu_Link", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements UserConfiguration_Menu_Link {
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<String> target = Optional.empty();
    boolean targetIsSet;
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("target")
    public void setTarget(Optional<String> target) {
      this.target = target;
      this.targetIsSet = true;
    }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> target() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableUserConfiguration_Menu_Link fromJson(Json json) {
    ImmutableUserConfiguration_Menu_Link.Builder builder = ImmutableUserConfiguration_Menu_Link.builder();
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.targetIsSet) {
      builder.target(json.target);
    }
    return (ImmutableUserConfiguration_Menu_Link) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link UserConfiguration_Menu_Link} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable UserConfiguration_Menu_Link instance
   */
  public static UserConfiguration_Menu_Link copyOf(UserConfiguration_Menu_Link instance) {
    if (instance instanceof ImmutableUserConfiguration_Menu_Link) {
      return (ImmutableUserConfiguration_Menu_Link) instance;
    }
    return ImmutableUserConfiguration_Menu_Link.builder()
        .name(instance.name())
        .target(instance.target())
        .build();
  }

  /**
   * Creates a builder for {@link UserConfiguration_Menu_Link UserConfiguration_Menu_Link}.
   * <pre>
   * ImmutableUserConfiguration_Menu_Link.builder()
   *    .name(String) // optional {@link UserConfiguration_Menu_Link#name() name}
   *    .target(String) // optional {@link UserConfiguration_Menu_Link#target() target}
   *    .build();
   * </pre>
   * @return A new UserConfiguration_Menu_Link builder
   */
  public static ImmutableUserConfiguration_Menu_Link.Builder builder() {
    return new ImmutableUserConfiguration_Menu_Link.Builder();
  }

  /**
   * Builds instances of type {@link UserConfiguration_Menu_Link UserConfiguration_Menu_Link}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "UserConfiguration_Menu_Link", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_NAME = 0x1L;
    private static final long OPT_BIT_TARGET = 0x2L;
    private long optBits;

    private @Nullable String name;
    private @Nullable String target;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link UserConfiguration_Menu_Link#name() name} to name.
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
     * Initializes the optional value {@link UserConfiguration_Menu_Link#name() name} to name.
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
     * Initializes the optional value {@link UserConfiguration_Menu_Link#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for chained invocation
     */
    public final Builder target(String target) {
      checkNotIsSet(targetIsSet(), "target");
      this.target = Objects.requireNonNull(target, "target");
      optBits |= OPT_BIT_TARGET;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration_Menu_Link#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("target")
    public final Builder target(Optional<String> target) {
      checkNotIsSet(targetIsSet(), "target");
      this.target = target.orElse(null);
      optBits |= OPT_BIT_TARGET;
      return this;
    }

    /**
     * Builds a new {@link UserConfiguration_Menu_Link UserConfiguration_Menu_Link}.
     * @return An immutable instance of UserConfiguration_Menu_Link
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public UserConfiguration_Menu_Link build() {
      return new ImmutableUserConfiguration_Menu_Link(name, target);
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean targetIsSet() {
      return (optBits & OPT_BIT_TARGET) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of UserConfiguration_Menu_Link is strict, attribute is already set: ".concat(name));
    }
  }
}
